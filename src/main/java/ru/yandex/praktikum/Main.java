package ru.yandex.praktikum;

import ru.yandex.praktikum.model.Apple;
import ru.yandex.praktikum.model.Food;
import ru.yandex.praktikum.model.Meat;
import ru.yandex.praktikum.model.constants.Colour;
import ru.yandex.praktikum.model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100);
        Food redApple = new Apple(10, 50, Colour.COLOR_RED);
        Food greenApple = new Apple(8, 60, Colour.COLOR_GREEN);

        Food[] product = {meat, redApple, greenApple};

        ShoppingCart shoppingCart = new ShoppingCart(product);

        System.out.println(shoppingCart.getFullAmount());
        System.out.println(shoppingCart.getFullAmountWithDiscount());
        System.out.println(shoppingCart.getFullAmountVegan());
    }
}
