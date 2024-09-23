public class Smartphone extends Computer {
    private boolean isOn;
    private String OS = "iOS";
    private double memory;
    private double storage = 128;
    private boolean isPortable = true;
    private int phoneNumber;

    public Smartphone(boolean isOn, String OS, double memory, double storage, boolean isPortable, int phoneNumber) {
        super(isOn, OS, memory, storage);
        this.isPortable = isPortable;
        this.phoneNumber = phoneNumber;
    }
}
