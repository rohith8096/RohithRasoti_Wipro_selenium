package assessmentday3;

public class SplitWords {
	public static void main(String[] args) {
		String sentence = "Hello Java World";
		String[] words = sentence.split(" ");
		for (String word : words) {
			System.out.println(word);
		}
	}

}
