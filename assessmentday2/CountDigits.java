package assessmentday2;

public class CountDigits {
    public static void main(String[] args) {
        int number = 6785;
        int count = 0;
        int temp = number;

        while (temp > 0) {
            count++;
            temp = temp / 10;
        }

        System.out.println("Total digits in " + number + " = " + count);
    }
}

