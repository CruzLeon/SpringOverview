package org.example.AOP;

import org.example.AOP.interfac.Motor;
import org.example.AOP.service.ClientService;
import org.example.AOP.service.MotorService;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.support.AopUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {

    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        ClientService clientService = context.getBean(ClientService.class);
        System.out.println(clientService.getClass());

        clientService.transfer();
        Motor motorService = context.getBean(Motor.class);
        System.out.println(motorService.getClass());
        motorService.transfer();
        motorService.returnValue();

        Thread.sleep(3000);

        //Para que este casteo funcione se neceita ser un proxy CGLIB proxyTargetClass = true
        //si no, como MotorService implementa una interfaz se creara un proxy JDK, y solo
        //se crearan advices en los metodos de esta interfaz, ya que throwing es un metodo publico
        //que no esta en la interfaz el advice no se enlazara.

        //((MotorService) motorService).throwing();

        //De este modo se recupera el objeto desde un proxy JDK, pero no tendra enlazado ningun advice
        System.out.println("\n\n" + AopUtils.getTargetClass(motorService));
        MotorService aux = (MotorService) ((Advised) motorService).getTargetSource().getTarget();
        try{
            aux.throwing();
        }catch (Exception e){
            System.out.println("---------------");
        }


        Thread.sleep(4000);
        System.out.println("In integer method");
        Integer asd = motorService.integerMethod("12");

        System.out.println("THE INTEGER RESULT IS "+asd);

        System.out.println("Auditable");
        Thread.sleep(3000);
        clientService.auditable("value1", "2value");
    }
}
