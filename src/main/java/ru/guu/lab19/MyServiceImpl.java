package ru.guu.lab19;


public class MyServiceImpl implements MyService {
    @Override
    public String process(String input) {
        return "Обработано с помощью Guice: " + input;
    }


}
