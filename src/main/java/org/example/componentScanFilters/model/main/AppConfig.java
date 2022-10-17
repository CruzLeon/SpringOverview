package org.example.componentScanFilters.model.main;

import org.example.componentScanFilters.model.model3.Person;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Repository;

@Configuration
@ComponentScan(
        basePackages = "org.example.componentScanFilters.model",
//        excludeFilters = {
//                @ComponentScan.Filter(
//                        type = FilterType.ANNOTATION,
//                        value = Repository.class
//                ),
//                @ComponentScan.Filter(
//                        type = FilterType.ANNOTATION,
//                        value = Repository.class
//                )
//        }

//        excludeFilters = @ComponentScan.Filter(
//                type = FilterType.ASSIGNABLE_TYPE,
//                value = Person.class)
        excludeFilters = @ComponentScan.Filter(
                type = FilterType.REGEX,
                pattern = ".*Person$"
        )
)
@ImportResource("javaConfig/componentScanFilters.xml")
public class AppConfig {
}
