package ru.javabegin.traning.fastjava2.OOP_12.objects;

public class Door {
    private String locate;
    private String color;
    private boolean automaticGlass;

    public void setLocate(String locate) {
        this.locate = locate;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAutomaticGlass(boolean automaticGlass) {
        this.automaticGlass = automaticGlass;
    }

    public String getLocate() {
        return locate;
    }

    public String getColor() {
        return color;
    }

    public boolean isAutomaticGlass() {
        return automaticGlass;
    }
}
