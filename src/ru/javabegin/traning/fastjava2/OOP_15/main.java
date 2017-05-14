package ru.javabegin.traning.fastjava2.OOP_15;

import ru.javabegin.traning.fastjava2.OOP_15.object.Phone;

public class main {
    public static void main(String[] args) {
        Phone phone = new Phone(1024, "Samsung", "GSM");
        System.out.println("phone.getName() = " + phone.getName() + ", phone.getType() = " + phone.getType() + ", phone.getArm() = " + phone.getArm());

        phone.setName("Nokia");
        System.out.println("phone.getName() = " + phone.getName() + ", phone.getType() = " + phone.getType() + ", phone.getArm() = " + phone.getArm());

        Phone phone1 = new Phone(2048, "LG", "GSM", "nm8900", "blue");
        System.out.println("phone1.getName() = " + phone1.getName() + ", phone1.getType() = " + phone1.getType() + ", phone1.getArm() = " + phone1.getArm() + ", phone1.getMooel() = " + phone1.getModel() + ", phone1.getColor() = " + phone1.getColor());


    }
}
