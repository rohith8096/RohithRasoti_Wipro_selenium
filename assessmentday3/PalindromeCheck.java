package assessmentday3;

public class PalindromeCheck {
	public static void main(String[] args) {
		String str = "madam";
		String reversed = new StringBuilder(str).reverse().toString();
		if (str.equals(reversed)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");

		}
	}

}
