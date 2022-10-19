package org.example.eventos.personalizadosSimples;

import org.example.eventos.personalizadosSimples.service.ClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ClientService service = context.getBean(ClientService.class);
        service.sendClient();

    }
}
