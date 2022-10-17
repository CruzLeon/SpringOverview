package org.example.qualifiers.model;

import javafx.application.Application;
import lombok.Data;
import org.example.qualifiers.Anotable;
import org.example.qualifiers.AnotableConValor;
import org.example.qualifiers.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Data
public class Qualifiers {

    @Autowired
    @Qualifier("cliente")
    Persona p;
    @Autowired
    @Anotable
    Persona p2;

    @Autowired
    @AnotableConValor("myValor")
    Persona p3;

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("qualifiers.xml");
        Qualifiers q = context.getBean(Qualifiers.class);
        System.out.println(q.p.saludar());
        System.out.println(q.p2.saludar());
        System.out.println(q.p3.saludar());
    }
}
