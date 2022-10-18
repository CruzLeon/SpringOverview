package org.example.internacionalizacion.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {

    @Bean
    public ResourceBundleMessageSource messageSource(){
        ResourceBundleMessageSource subject = new ResourceBundleMessageSource();
        subject.setBasenames("resourceBundle/exceptions", "resourceBundle/format");
        return subject;
    }
}
