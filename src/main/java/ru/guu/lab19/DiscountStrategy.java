package ru.guu.lab19;

public interface DiscountStrategy {
    String process(String name, double price, double discount);
}
