package assessmentday3;

public class MinMaxFinder {
	public static void main(String[] args) {
		int[] arr = { 23, 11, 67, 45, 9 };
		int max = arr[0], min = arr[0];

		for (int num : arr) {
			if (num > max)
				max = num;
			if (num < min)
				min = num;
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}

}
