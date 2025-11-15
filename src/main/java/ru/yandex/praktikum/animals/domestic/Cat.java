package ru.yandex.praktikum.animals.domestic;

public class Cat {
    int pearsCount;
    String[] menu = {"Шарлотка грушевая", "Компот грушевый", "Салат из груш и лисичек", "Рулет с грушами"};

    public void cook(){
        String name="";
        System.out.println("Готовим "+name);
        pearsCount=pearsCount-1;
    }