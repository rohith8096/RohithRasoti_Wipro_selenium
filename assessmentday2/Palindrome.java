package assessmentday2;

public class Palindrome {
	
	    public static void main(String[] args) {
	        int number = 121; 
	        int originalNumber = number;
	        int reversedNumber = 0;

	        while (number > 0) {
	            int digit = number % 10;
	            reversedNumber = reversedNumber * 10 + digit;
	            number /= 10;
	        }

	        if (originalNumber == reversedNumber) {
	            System.out.println(originalNumber + " is a palindrome number.");
	        } else {
	            System.out.println(originalNumber + " is not a palindrome number.");
	        }
	    
	}

}
