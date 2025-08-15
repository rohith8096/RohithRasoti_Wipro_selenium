package assessmentday3;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = "Java is a powerful language";
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Word Count: " + words.length);
    }
}

