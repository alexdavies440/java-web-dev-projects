public class Computer {
    private boolean isOn = false;
    private String OS;
    private double memory;
    private double storage;

    public Computer(boolean isOn, String OS, double memory, double storage) {
        this.isOn = isOn;
        this.OS = OS;
        this.memory = memory;
        this.storage = storage;
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
}
