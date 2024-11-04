package creational.builder.demo_builder;

import creational.builder.HDD;
import creational.builder.RAM;

public class Computer {

    /**
     * Static inner class that builder needs
     */
    public static class ComputerBuilder {
        private HDD diskSize;
        private RAM ramSize;
        private boolean hasUsbc;
        private boolean hasGigabitWifi;

        public ComputerBuilder() {

        }

        /**
         * Method in inner static class that will tactfully create object that we want with specific params
         *
         * @return Computer instance
         */
        public Computer build() {
            return new Computer(this);
        }

        public ComputerBuilder addRam(RAM ramSize) {
            this.ramSize = ramSize;
            return this;
        }

        public ComputerBuilder addDisk(HDD diskSize) {
            this.diskSize = diskSize;
            return this;
        }

        public ComputerBuilder hasUsbc(boolean hasUsbc) {
            this.hasUsbc = hasUsbc;
            return this;
        }

        public ComputerBuilder hasGigabitWifi(boolean hasGigabitWifi) {
            this.hasGigabitWifi = hasGigabitWifi;
            return this;
        }
    }

    private final HDD diskSize;
    private final RAM ramSize;
    private final boolean hasUsbc;
    private final boolean hasGigabitWifi;

    public Computer(ComputerBuilder builder) {
        this.diskSize = builder.diskSize;
        this.ramSize = builder.ramSize;
        this.hasUsbc = builder.hasUsbc;
        this.hasGigabitWifi = builder.hasGigabitWifi;
    }

    public HDD getDiskSize() {
        return diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public boolean hasUsbc() {
        return hasUsbc;
    }

    public boolean hasGigabitWifi() {
        return hasGigabitWifi;
    }
}
