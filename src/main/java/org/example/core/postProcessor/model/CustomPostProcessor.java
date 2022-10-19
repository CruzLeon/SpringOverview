package org.example.core.postProcessor.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class CustomPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("The bean is "+ bean + " its name "+ beanName);
        return bean;
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
