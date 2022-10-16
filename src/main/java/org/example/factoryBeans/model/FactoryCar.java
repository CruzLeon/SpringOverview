package org.example.factoryBeans.model;

import org.springframework.beans.factory.FactoryBean;

public class FactoryCar implements FactoryBean<Car> {

    @Override
    public Car getObject() throws Exception {
        return new Car();
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
