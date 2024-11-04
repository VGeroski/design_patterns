package creational.builder.demo_builder;

import creational.builder.HDD;
import creational.builder.RAM;

public class ComputerBuilderDemo {

    public static void main(String[] args) {

        Computer.ComputerBuilder builder = new Computer.ComputerBuilder();

        builder.addRam(RAM.DEFAULT).addDisk(HDD.UPGRADED).hasUsbc(true);
        Computer computer = builder.build();

        System.out.println(computer.getDiskSize());
        System.out.println(computer.getRamSize());
        System.out.println(computer.hasUsbc());
        System.out.println(computer.hasGigabitWifi());
    }
}
