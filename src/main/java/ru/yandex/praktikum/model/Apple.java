package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.constants.Discount;

public class Apple extends Food {
    private final String colour;

    public Apple(int amount, double price, String color) {
        super(amount, price, true);
        this.colour = color;

    }

    @Override
    public double getDiscount() {
        if (colour.equals(Colour.COLOR_RED)) {
            return Discount.RED_APPLE_DISCOUNT;
        }
        return 0.0;
    }

}
