package assessmentday2;

public class Fibanocci {
	
	    public static void main(String[] args) {
	        int terms = 10; 
	        int a = 0, b = 1;

	        System.out.println("Fibonacci Series up to " + terms + " terms:");
	        for (int i = 1; i <= terms; i++) {
	            System.out.print(a + " ");
	            int nextTerm = a + b;
	            a = b;
	            b = nextTerm;
	        }
	        System.out.println();
	    
	}

}
