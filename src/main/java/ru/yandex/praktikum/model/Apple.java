package ru.yandex.praktikum.model;

import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.constants.Discount;

public class Apple extends Food{
    public String colour;
    public Apple(int amount, double price, String color){
        this.amount=amount;
        this.price=price;
        this.colour=color;
        this.isVegetarian=true;
    }
@Override
public double getPriceWithDiscount() {
        if (colour == Colour.colorRed) {
          return price*(1- Discount.redAppleDiscount/100);
        }
        return price;
    }
}
