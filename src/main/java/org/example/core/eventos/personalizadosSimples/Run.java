package org.example.core.eventos.personalizadosSimples;

import org.example.core.eventos.personalizadosSimples.service.ClientService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Run {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ClientService service = context.getBean(ClientService.class);
        service.sendClient();

    }
}
