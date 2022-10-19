package org.example.core.internacionalizacion.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {

    @Bean
    public ResourceBundleMessageSource messageSource(){
        ResourceBundleMessageSource subject = new ResourceBundleMessageSource();
        subject.setBasenames("core/resourceBundle/exceptions", "core/resourceBundle/format");
        return subject;
    }
}
