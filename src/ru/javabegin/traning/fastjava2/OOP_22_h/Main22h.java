package ru.javabegin.traning.fastjava2.OOP_22_h;

import ru.javabegin.traning.fastjava2.OOP_22_h.Computer.Laptop;
import ru.javabegin.traning.fastjava2.OOP_22_h.Fruit.Antonovka;

public class Main22h {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("HP", 120, 4,2500,15);
        System.out.println("laptop1.getName() = " + laptop1.getName());
        System.out.println("laptop1.getVolumeHdd() = " + laptop1.getVolumeHdd());
        System.out.println("laptop1.getVolumeDdr() = " + laptop1.getVolumeDdr());
        System.out.println("laptop1.getCpuFrequence() = " + laptop1.getCpuFrequence());
        System.out.println("laptop1.getScreenSize() = " + laptop1.getScreenSize());
        laptop1.turnOn();
        laptop1.handleInfo();
        laptop1.show();
        laptop1.storeInfo();
        laptop1.turnOff();
        laptop1.beMoved();


        Antonovka fruit1234 = new Antonovka(200, "green", "apple", "antonovka");
        fruit1234.mature();
    }




}
