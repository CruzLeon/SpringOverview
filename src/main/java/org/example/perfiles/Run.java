package org.example.perfiles;

import org.example.perfiles.model.Cliente;
import org.example.perfiles.model.Empleado;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("dev");
        context.register(AppConfig.class);
        context.refresh();

        Cliente dev = context.getBean(Cliente.class);
        Empleado e = context.getBean(Empleado.class);
        System.out.println(dev);
        System.out.println(e);

        AnnotationConfigApplicationContext context2  = new AnnotationConfigApplicationContext();
        context2.getEnvironment().setActiveProfiles("qa");
        context2.register(AppConfig.class);
        context2.refresh();
        Cliente qa = context2.getBean(Cliente.class);
        System.out.println(qa);

    }
}
