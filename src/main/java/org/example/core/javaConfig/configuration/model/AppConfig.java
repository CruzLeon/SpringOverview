package org.example.core.javaConfig.configuration.model;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example.javaConfig.configuration")
@ImportResource("classpath:javaConfig/config.xml")
public class AppConfig {

}
