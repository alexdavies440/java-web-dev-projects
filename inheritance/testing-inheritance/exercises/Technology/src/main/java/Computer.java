public class Computer {
    private boolean isOn = false;
    private String OS = "Linux";
    private double memory = 8;
    private double storage = 32;

    public Computer(boolean isOn, String OS, double memory, double storage) {
        this.isOn = isOn;
        this.OS = OS;
        this.memory = memory;
        this.storage = storage;
    }

    public Computer() {

    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getMemory() {
        return memory;
    }

    public double getStorage() {
        return storage;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn(boolean on) {
        this.isOn = on;
    }
}
