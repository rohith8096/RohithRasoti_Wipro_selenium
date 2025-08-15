package assessmentday6;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;
        int truncatedFahrenheit = (int) fahrenheit;

        System.out.println("Fahrenheit (precise): " + fahrenheit);
        System.out.println("Fahrenheit (truncated to int): " + truncatedFahrenheit);

        // Precision loss comment:
        // When converting double to int, the decimal part is removed (truncated),
        // which can result in loss of information (e.g., 99.5 becomes 99).
    }
}

