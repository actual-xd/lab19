package ru.guu.lab19;

import com.google.inject.AbstractModule;


public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(MyService.class).to(MyServiceImpl.class);
        bind(DiscountStrategy.class).to(DiscountStrategyImpl.class);
    }
}