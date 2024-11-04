package creational.builder.demo_immutability;

import creational.builder.HDD;
import creational.builder.RAM;

/**
 * Computer class setup this way is not immutable
 * We can change every param with setter-s, or even omit some of them while instantiating object
 * That is maybe ok, but we do not have contract
 */
public class Computer {

    private HDD diskSize;
    private RAM ramSize;

    private boolean hasUsbc;
    private boolean hasGigabitWifi;

    public Computer() {
    }

    public HDD getDiskSize() {
        return diskSize;
    }

    public void setDiskSize(HDD diskSize) {
        this.diskSize = diskSize;
    }

    public RAM getRamSize() {
        return ramSize;
    }

    public void setRamSize(RAM ramSize) {
        this.ramSize = ramSize;
    }

    public boolean hasUsbc() {
        return hasUsbc;
    }

    public void setHasUsbc(boolean hasUsbc) {
        this.hasUsbc = hasUsbc;
    }

    public boolean hasGigabitWifi() {
        return hasGigabitWifi;
    }

    public void setHasGigabitWifi(boolean hasGigabitWifi) {
        this.hasGigabitWifi = hasGigabitWifi;
    }
}
