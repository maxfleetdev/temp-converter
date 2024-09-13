public class Math {
    public static double toCelsius(double value) {
        return (value - 32) * 5/9;
    }

    public static double toFahrenheit(double value) {
        return (value * 9/5) + 32;
    }
}
