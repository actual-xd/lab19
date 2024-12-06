package ru.guu.lab19;

public class DiscountStrategyImpl implements DiscountStrategy {
    @Override
    public String process(String name, double price, double discount) {

        return "Цена за товар " + name + ": " + (price - (price * discount / 100)) + " с учетом скидки " + discount + "%";

    }

}
