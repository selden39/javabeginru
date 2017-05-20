package ru.javabegin.traning.fastjava2.OOP_22_h.Fruit;

public class Apple extends Fruit {
    private String kindApple;

    public Apple(int weight, String color, String kindFruit, String kindApple) {
        super(weight, color, kindFruit);
        this.kindApple = kindApple;
    }
}
