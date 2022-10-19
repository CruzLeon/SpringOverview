package org.example.core.eventos.personalizadosSimples.listener;

import org.example.core.eventos.personalizadosSimples.event.AcceptedClient;
import org.example.core.eventos.personalizadosSimples.event.RefusedClient;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class RefusedClientNotifier implements ApplicationListener<RefusedClient>, ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    @Override
    public void onApplicationEvent(RefusedClient refusedClient) {
        System.out.println("Notificacion");
        System.out.println(refusedClient);
        publisher.publishEvent(new AcceptedClient(this, refusedClient.getCliente()));

    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }
}
