package ru.javabegin.traning.fastjava2.OOP_22.objects;

public class Toyota {
    private String name;
    private double volume;

    public Toyota(String name, double volume) {
        this.name = name;
        this.volume = volume;
        System.out.println("Toyota constructor");
    }

    public Toyota(String name) {
        this.name = name;
    }

    public Toyota(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
