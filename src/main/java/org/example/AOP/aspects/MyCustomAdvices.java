package org.example.AOP.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.example.AOP.annot.AuditCode;
import org.example.AOP.annot.Auditable;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * Los consejos estan asociados a un punto de corte, puede ser externo o definido internamente en
 * before,
 */
@Aspect
@Component
public class MyCustomAdvices {

    @Before("org.example.AOP.aspects.MyCustomPointCuts.tradingOperation()")
    public void beforeTransfer(){
        System.out.println("In before transfer aspect");
    }

    @AfterReturning("org.example.AOP.aspects.MyCustomPointCuts.tradingOperation()")
    public void afterReturningTransfer(){
        System.out.println("After returning transfer aspect");
    }

    @After("org.example.AOP.aspects.MyCustomPointCuts.tradingOperation()")
    public void afterTransfer(){
        System.out.println("After transfer aspect");
    }
    /**
     * ------------------------------
     */

    @Before("org.example.AOP.aspects.MyCustomPointCuts.inAOPpackage()")
    public void beforeAOP(){
        System.out.println("Before in AOP package");
    }

    @AfterReturning(
            pointcut = "org.example.AOP.aspects.MyCustomPointCuts.anyPublicOperation() && " +
                    "org.example.AOP.aspects.MyCustomPointCuts.inAOPpackage()",
            returning = "retVal"
    )
    public void retVal(String retVal){
        System.out.println("In after returning public method in aoppackage");
        System.out.println(retVal);
    }

    @AfterThrowing(
            pointcut = "execution(public String org.example.AOP.service.MotorService.throwing())",
            throwing = "e")
    public void retry(Exception e){
        System.out.println("Retring methods in "+ e.getMessage());

    }


    @Around("execution(Integer org.example.AOP.service.MotorService.integerMethod(..))")
    public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Start time");
        Object retVal = pjp.proceed();
        System.out.println("INTO AROUND ADVICE VALUE "+ retVal);
        System.out.println("Stop Time");
        return retVal;
    }

    /**
     * Pasar parametros a advices
     */

    @Before("execution(Integer org.example.AOP.service.MotorService.integerMethod(..)) && args(account,..)")
    public void validateAccount(String account) {
        System.out.println("\n\n\n the parameter in advice before is "+account+" \n\n\n");
    }

    /**
     * Filtrado por anotaciones
     */
    @Before("execution(public String org.example.AOP.service.ClientService.auditable(..)) && " +
            "@annotation(auditable)")
    public void audit(JoinPoint joinPoint, Auditable auditable) {
        AuditCode code = auditable.value();
        Object[] args = joinPoint.getArgs();
        System.out.println("In auditable advice is");
        System.out.println(code);
        Arrays.stream(args).forEach(System.out::println);
        // ...
    }

    @Around("execution(public String org.example.AOP.service.ClientService.auditable(..)) && " +
            "@annotation(auditable)")
    public void auditChangParams(ProceedingJoinPoint joinPoint, Auditable auditable) throws Throwable {
        System.out.println("Audit Change params");
        Thread.sleep(4000);
        AuditCode code = auditable.value();
        Object[] args = joinPoint.getArgs();
        joinPoint.proceed(new Object[]{"Value3", "value4"});
        System.out.println("In auditable around advice is");
        System.out.println(code);
        Arrays.stream(args).forEach(System.out::println);
        // ...
    }

}
