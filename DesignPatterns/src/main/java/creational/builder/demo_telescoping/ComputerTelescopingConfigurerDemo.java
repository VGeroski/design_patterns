package creational.builder.demo_telescoping;

import creational.builder.HDD;
import creational.builder.RAM;

public class ComputerTelescopingConfigurerDemo {

    public static void main(String[] args) {

        ComputerTelescoping computer = new ComputerTelescoping(HDD.DEFAULT, RAM.DEFAULT, true, true);

        System.out.println(computer.getDiskSize());
        System.out.println(computer.getRamSize());
        System.out.println(computer.hasUsbc());
        System.out.println(computer.hasGigabitWifi());
    }
}
