package org.example.javaConfig.configuration.model;

import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan("org.example.javaConfig.configuration")
@ImportResource("classpath:javaConfig/config.xml")
public class AppConfig {

}
