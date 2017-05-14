package ru.javabegin.traning.fastjava2.OOP_15.object;

public class Phone {
    private int arm;
    private String name;
    private String type;
    private String model;
    private String color;

    public Phone() {
    }

    public Phone(int arm, String name, String type) {
        this.arm = arm;
        this.name = name;
        this.type = type;
    }

    public Phone(int arm, String name, String type, String model, String color) {
        this.arm = arm;
        this.name = name;
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public int getArm() {
        return arm;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setArm(int arm) {
        this.arm = arm;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
