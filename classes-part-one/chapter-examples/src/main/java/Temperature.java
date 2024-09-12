public class Temperature {

    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {
            System.out.println("Value is below absolute zero");
        }

        fahrenheit = aFahrenheit;
    }

    public double getCelsius() {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public void setCelsius(double celsius) {
        double fahrenheit = celsius * 9.0 / 5.0 + 32;
        setFahrenheit(fahrenheit);
    }

    public static void main(String[] args) {


    }
}