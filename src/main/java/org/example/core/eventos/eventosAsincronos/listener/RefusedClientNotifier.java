package org.example.core.eventos.eventosAsincronos.listener;

import org.example.core.eventos.eventosAsincronos.event.AcceptedClient;
import org.example.core.eventos.eventosAsincronos.event.RefusedClient;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class RefusedClientNotifier implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @EventListener
    @Async
    public void processRefusedClientEvent(RefusedClient refusedClient) {
        System.out.println("Notificacion");
        System.out.println(refusedClient);
        publisher.publishEvent(new AcceptedClient(this, refusedClient.getCliente()));
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
