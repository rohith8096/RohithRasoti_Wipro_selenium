package assessmentday6;
public class IntToStringConversion {
    public static void main(String[] args) {
        int number = 123;

        String str = String.valueOf(number);
        System.out.println("Integer as String: " + str);

        try {
            int parsed = Integer.parseInt(str);
            System.out.println("String back to int: " + parsed);
        } catch (NumberFormatException e) {
            System.out.println("Invalid string to convert to int");
        }
    }
}

