package org.example.javaConfig_with_XML.model.package1;

import org.example.javaConfig_with_XML.model.Empleado;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("org.example.javaConfig_with_XML.model.package1")
@ImportResource("javaConfig_with_xml.xml")
public class AppConfig {

    @Bean
    public Empleado getBean() {
        return new Empleado();
    }

}
