package org.example.componentScanFilters;

import org.example.componentScanFilters.model.main.AppConfig;
import org.example.componentScanFilters.model.model2.Bird;
import org.example.componentScanFilters.model.model2.InnerModel.Laptop;
import org.example.componentScanFilters.model.model3.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentScanFilters {

    public static void main(String[] args) throws InterruptedException {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        Laptop a = context.getBean(Laptop.class);
        Bird b = context.getBean(Bird.class);
        Person c = context.getBean(Person.class);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}
