package ru.javabegin.traning.fastjava2.OOP_22_h.Computer;

public class Laptop extends PersonalComputer {
    public Laptop(String name, int volumeHdd, int volumeDdr, int cpuFrequence, int screenSize) {
        super(name, volumeHdd, volumeDdr, cpuFrequence, screenSize);
    }
    public void beMoved (){
        System.out.println("I can be moved");
    }
}
