package org.example.eventos.personalizadosSimples.service;

import org.example.eventos.personalizadosSimples.event.RefusedClient;
import org.example.eventos.personalizadosSimples.model.Cliente;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class ClientService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;


    public void sendClient() {
        Cliente subject = new Cliente();
        subject.setId("12");
        if (subject.getId().equalsIgnoreCase("12")) {
            publisher
                    .publishEvent(new RefusedClient(this, subject));
            System.out.println("Finalizacion publishAware");
            return;
        }
        System.out.println("Finalizacion Send client");

    }


    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
}
