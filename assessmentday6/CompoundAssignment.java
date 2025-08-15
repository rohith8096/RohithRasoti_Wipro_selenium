package assessmentday6;
public class CompoundAssignment {
    public static void main(String[] args) {
        int x = 5;

        // x = x + 4.5; //This line will cause a compile-time error because 4.5 is a double.

        x += 4.5;       //This compiles and implicitly casts the result to int.
        System.out.println("Value of x after x += 4.5: " + x);
    }
}

