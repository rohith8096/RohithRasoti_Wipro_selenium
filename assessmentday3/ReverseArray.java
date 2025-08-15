package assessmentday3;
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        System.out.print("Reversed array: ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

