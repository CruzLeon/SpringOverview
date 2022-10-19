package org.example.core.XML_with_JavaConfig;

import org.example.core.XML_with_JavaConfig.model.Empleado;
import org.example.core.XML_with_JavaConfig.model.package2.Empleado2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("core/xml_with_javaConfig.xml");
        Empleado e = context.getBean(Empleado.class);
        Empleado2 r = context.getBean(Empleado2.class);
        System.out.println(e.saludar());
        System.out.println(r.saludar());
    }
}
