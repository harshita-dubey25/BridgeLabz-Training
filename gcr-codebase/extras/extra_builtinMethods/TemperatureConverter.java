import java.util.Scanner;
public class TemperatureConverter {
    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== TEMPERATURE CONVERTER =====");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();
        double temperature, result;
        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                temperature = sc.nextDouble();
                result = fahrenheitToCelsius(temperature);
                System.out.println("Temperature in Celsius: " + result);
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                temperature = sc.nextDouble();
                result = celsiusToFahrenheit(temperature);
                System.out.println("Temperature in Fahrenheit: " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}
