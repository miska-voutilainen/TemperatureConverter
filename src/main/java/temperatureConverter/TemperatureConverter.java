package temperatureConverter;

import java.util.Scanner;

public class TemperatureConverter {

    // Celsius <-> Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // Celsius <-> Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    // Fahrenheit <-> Kelvin
    public static double fahrenheitToKelvin(double fahrenheit) {
        return celsiusToKelvin(fahrenheitToCelsius(fahrenheit));
    }

    public static double kelvinToFahrenheit(double kelvin) {
        return celsiusToFahrenheit(kelvinToCelsius(kelvin));
    }

    public static boolean isExtremeTemperature(double celsius) {
        return celsius < -40.0 || celsius > 50.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Choose an option (1-6): ");

        int choice = scanner.nextInt();
        System.out.print("Enter the temperature value: ");
        double value = scanner.nextDouble();
        double result;

        switch (choice) {
            case 1:
                result = celsiusToFahrenheit(value);
                System.out.printf("%.2f °C = %.2f °F%n", value, result);
                break;
            case 2:
                result = fahrenheitToCelsius(value);
                System.out.printf("%.2f °F = %.2f °C%n", value, result);
                break;
            case 3:
                result = celsiusToKelvin(value);
                System.out.printf("%.2f °C = %.2f K%n", value, result);
                break;
            case 4:
                result = kelvinToCelsius(value);
                System.out.printf("%.2f K = %.2f °C%n", value, result);
                break;
            case 5:
                result = fahrenheitToKelvin(value);
                System.out.printf("%.2f °F = %.2f K%n", value, result);
                break;
            case 6:
                result = kelvinToFahrenheit(value);
                System.out.printf("%.2f K = %.2f °F%n", value, result);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
        scanner.close();
    }
}
