package creational.builder.demo_telescoping;

import creational.builder.HDD;
import creational.builder.RAM;

/**
 * We don't have default constructor and no setters
 * Instead we have specific constructor for multiple scenarios
 * This way we have contract, and we can guarantee immutability (if that is important)
 *
 * If we have a lot of parameters, we have to make all constructors for every combination, which is bad
 */
public class ComputerTelescoping {

    private HDD diskSize;
    private RAM ramSize;

    private boolean hasUsbc;
    private boolean hasGigabitWifi;

    public ComputerTelescoping(HDD diskSize) {
        this.diskSize = diskSize;
    }

    public ComputerTelescoping(RAM ramSize) {
        this.ramSize = ramSize;
    }

    public ComputerTelescoping(HDD diskSize, RAM ramSize) {
        this(diskSize);
        this.ramSize = ramSize;
    }

    public ComputerTelescoping(HDD diskSize, RAM ramSize, boolean hasUsbc) {
        this(diskSize, ramSize);
        this.hasUsbc = hasUsbc;
    }

    public ComputerTelescoping(HDD diskSize, RAM ramSize, boolean hasUsbc, boolean hasGigabitWifi) {
        this(diskSize, ramSize, hasUsbc);
        this.hasGigabitWifi = hasGigabitWifi;
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
