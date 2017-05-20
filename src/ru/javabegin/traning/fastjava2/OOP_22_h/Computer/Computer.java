package ru.javabegin.traning.fastjava2.OOP_22_h.Computer;

public class Computer {
    private String name;
    private int volumeHdd;
    private int volumeDdr;
    private int cpuFrequence;

    public Computer(String name, int volumeHdd, int volumeDdr, int cpuFrequence) {
        this.name = name;
        this.volumeHdd = volumeHdd;
        this.volumeDdr = volumeDdr;
        this.cpuFrequence = cpuFrequence;
    }

    public String getName() {
        return name;
    }

    public int getVolumeHdd() {
        return volumeHdd;
    }

    public int getVolumeDdr() {
        return volumeDdr;
    }

    public int getCpuFrequence() {
        return cpuFrequence;
    }

    public void turnOn(){
        System.out.println("I`m turn on");

    }
    public void turnOff(){
        System.out.println("I`m turn off");
    }
    public void storeInfo(){
        System.out.println("I`m saved you Info");
    }
    public void handleInfo(){
        System.out.println("I`m handled you Info");
    }
}
