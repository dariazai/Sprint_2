package ru.yandex.praktikum.service;

import ru.yandex.praktikum.model.Food;


public class ShoppingCart {
    Food[] food = new Food[3];

    public ShoppingCart(Food[] food) {
        this.food = food;
    }

    public double getFullAmount() { //сумма всех товаров без скидки
        double sum = 0;

        for (int i = 0; i < food.length; i++) {
            double itemSum = food[i].getAmount() * food[i].getPrice();
            sum = itemSum + sum;
        }
        return sum;
    }

    public double getFullAmountWithDiscount() { //сумма всех товаров со скидкой
        double sum = 0;

        for (int i = 0; i < food.length; i++) {

            double itemSum = food[i].getAmount() * food[i].getPrice() * (1 - food[i].getDiscount() / 100);
            sum = itemSum + sum;
        }
        return sum;
    }

    public double getFullAmountVegan() { //сумма всех товаров без скидки веганских
        double sum = 0;

        for (int i = 0; i < food.length; i++) {
            Food item = food[i];
            if (item.isVegetarian()) {
                double itemSum = item.getAmount() * item.getPrice();
                sum = itemSum + sum;
            }
        }
        return sum;
    }
}
