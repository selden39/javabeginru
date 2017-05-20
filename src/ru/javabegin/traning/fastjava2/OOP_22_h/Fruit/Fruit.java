package ru.javabegin.traning.fastjava2.OOP_22_h.Fruit;

public class Fruit {
    private int weight;
    private String color;
    private String kindFruit;

    public Fruit(int weight, String color, String kindFruit) {
        this.weight = weight;
        this.color = color;
        this.kindFruit = kindFruit;
    }
    public void rot(){
        System.out.println("I`m rot");
    }
    public void mature(){
        System.out.println("I`m mature");
    }

}
