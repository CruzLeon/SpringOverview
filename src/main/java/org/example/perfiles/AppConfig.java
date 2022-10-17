package org.example.perfiles;

import org.example.perfiles.model.Cliente;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Profile;

@Configuration
@ImportResource("profiles.xml")
public class AppConfig {

    @Profile("dev")@Bean
    public Cliente clienteDev(){
        Cliente dev = new Cliente();
        dev.setNombre("cliente Dev");
        return dev;
    }

    @Profile("qa")@Bean
    public Cliente clienteQA(){
        Cliente qa = new Cliente();
        qa.setNombre("cliente QA");
        return qa;
    }
}
