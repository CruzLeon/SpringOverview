package org.example.resources;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.Resource;


public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        Resource txt = context.getResource("classpath:resourc/file.txt");
        System.out.println(txt);
        Resource js = context.getResource("classpath:resourc/file.js");
        System.out.println(js);
    }
}
