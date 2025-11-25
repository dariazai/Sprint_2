package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.constants.Discount;

public class Apple extends Food implements Discountable {
    private final String colour;
    public Apple(int amount, double price, String color){
        super(amount, price, true);
        this.colour=color;

    }
@Override
public double getDiscount() {
    if (colour.equals(Colour.colorRed)) {
        return Discount.redAppleDiscount;
        }
    return 0.0;
    }

}
