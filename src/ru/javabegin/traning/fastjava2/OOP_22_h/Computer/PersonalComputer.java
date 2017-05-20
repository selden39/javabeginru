package ru.javabegin.traning.fastjava2.OOP_22_h.Computer;

public class PersonalComputer extends Computer {
    private int screenSize;
    public PersonalComputer(String name, int volumeHdd, int volumeDdr, int cpuFrequence, int screenSize) {
        super(name, volumeHdd, volumeDdr, cpuFrequence);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void show(){
        System.out.println("I`m show Info");
    }
}
