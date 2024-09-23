public class Laptop extends Computer {
    private boolean isOn;
    private String OS;
    private double memory = 16;
    private double storage = 500;
    private boolean isPortable = true;

    public Laptop(boolean isOn, String OS, double memory, double storage, boolean isPortable) {
        super(isOn, OS, memory, storage);
        this.isPortable = isPortable;
    }
}
