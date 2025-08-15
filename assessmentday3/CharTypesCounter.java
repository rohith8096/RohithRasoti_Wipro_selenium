package assessmentday3;

public class CharTypesCounter {
    public static void main(String[] args) {
        String str = "Hello 123! @Java";
        int letters = 0, digits = 0, spaces = 0, special = 0;
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) digits++;
            else if (Character.isSpaceChar(c)) spaces++;
            else special++;
        }
        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special Characters: " + special);
    }
}

