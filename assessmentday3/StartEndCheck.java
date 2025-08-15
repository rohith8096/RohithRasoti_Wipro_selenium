package assessmentday3;
public class StartEndCheck {
    public static void main(String[] args) {
        String word = "java";
        if (word.startsWith("j") && word.endsWith("a")) {
            System.out.println("Starts with 'j' and ends with 'a'");
        } else {
            System.out.println("Does not match the condition");
        }
    }
}

