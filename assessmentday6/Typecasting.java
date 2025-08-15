package assessmentday6;
import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        double widened = intValue;
        System.out.println("Original int: " + intValue);
        System.out.println("After implicit widening to double: " + widened);

        System.out.print("Enter a double value: ");
        double doubleValue = scanner.nextDouble();
        int narrowedInt = (int) doubleValue;
        short narrowedShort = (short) narrowedInt;
        System.out.println("Original double: " + doubleValue);
        System.out.println("After casting to int (truncation): " + narrowedInt);
        System.out.println("After casting to short (possible overflow): " + narrowedShort);
    }
}

