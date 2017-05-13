package ru.javabegin.traning.fastjava2.OOP_12;
import ru.javabegin.traning.fastjava2.OOP_12.objects.Car;
import ru.javabegin.traning.fastjava2.OOP_12.objects.Door;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println("car1.getName() = " + car1.getName());

        car1.setName("Toyota");
        System.out.println("car1.getName() = " + car1.getName());

        Door door1 = new Door();
        door1.setLocate("front left");
        door1.setColor("red");
        door1.setAutomaticGlass(true);
        System.out.println(door1.getLocate() + " " + door1.getColor() + " " + door1.isAutomaticGlass());

        Door door2 = new Door();
        door2.setLocate("rear right");
        door1.setColor("green");
        door1.setAutomaticGlass(false);
        System.out.println(door1.getLocate() + " " + door1.getColor() + " " + door1.isAutomaticGlass());

    }
}
