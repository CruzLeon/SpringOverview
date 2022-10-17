package org.example.javaConfig_with_XML;


import org.example.javaConfig_with_XML.model.Empleado;
import org.example.javaConfig_with_XML.model.package1.AppConfig;
import org.example.javaConfig_with_XML.model.package1.Cliente;
import org.example.javaConfig_with_XML.model.package2.Empleado2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Empleado e = context.getBean(Empleado.class);
        Empleado2 r = context.getBean(Empleado2.class);
        Cliente rt = context.getBean(Cliente.class);
        System.out.println(e.saludar());
        System.out.println(r.saludar());
        System.out.println(rt);
    }
}
