package org.example.eventos.personalizadosSimples.listener;

import org.example.eventos.personalizadosSimples.event.RefusedClient;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class RefusedClientNotifier implements ApplicationListener<RefusedClient> {

    @Override
    public void onApplicationEvent(RefusedClient refusedClient) {
        System.out.println("Notificacion");
        System.out.println(refusedClient);

    }
}
