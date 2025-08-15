package assessmentday3;

public class RemoveSpaces {
    public static void main(String[] args) {
        String input = "Java   Programming  Language";
        String result = input.replaceAll("\\s+", "");
        System.out.println("Without Spaces: " + result);
    }
}

