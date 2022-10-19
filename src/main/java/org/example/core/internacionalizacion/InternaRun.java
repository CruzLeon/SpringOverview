package org.example.core.internacionalizacion;

import org.example.core.internacionalizacion.model.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Locale;

public class InternaRun {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        String propertyEn = context.getMessage("propp",null, Locale.ENGLISH);
        String propertyEs = context.getMessage("propp",null, new Locale("es"));

        System.out.println(propertyEn);
        System.out.println(propertyEs);
    }
}
