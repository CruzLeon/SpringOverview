package org.example.core.javaConfig.configuration.model;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {
        "com.todo1.service.pagalo.xyz.xyz",
        "com.todo1.service.pagalo.another...",
        "com.todo1.service.pagalo.common.filters"})
public class AppConfig {

}
