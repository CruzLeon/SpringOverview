package org.example.javaConfig.valueAnnotation.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySources({
        @PropertySource("classpath:javaConfig/application.properties"),
        @PropertySource("classpath:javaConfig/application.yml")
})
public class AppConfig {

    /**
     * Esta configuracion por defecto de Bean hace que las propiedades que se injecten con
     * @Value sean obligatorias, en caso de que no se encuentren se genere una excepcion
     *
     */
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        return new PropertySourcesPlaceholderConfigurer();
    }
}
