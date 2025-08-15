package assessmentday3;

public class VowelCounter {
    public static void main(String[] args) {
        String input = "Programming".toLowerCase();
        int count = 0;
        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}



