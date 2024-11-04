package creational.builder.demo_immutability;

import creational.builder.HDD;
import creational.builder.RAM;

public class ComputerConfigurerDemo {

    public static void main(String[] args) {

        Computer computer = new Computer();

        computer.setDiskSize(HDD.DEFAULT);
        computer.setRamSize(RAM.DEFAULT);
        computer.setHasUsbc(true);
        computer.setHasGigabitWifi(true);

        System.out.println(computer.getDiskSize());
        System.out.println(computer.getRamSize());
        System.out.println(computer.hasUsbc());
        System.out.println(computer.hasGigabitWifi());
    }
}
