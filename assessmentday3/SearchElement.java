package assessmentday3;

import java.util.Scanner;

public class SearchElement {
	public static void main(String[] args) {
		int[] arr = { 3, 8, 2, 6, 10 };
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to search: ");
		int key = sc.nextInt();
		boolean found = false;

		for (int num : arr) {
			if (num == key) {
				found = true;
				break;
			}
		}

		if (found)
			System.out.println(key + " found in array.");
		else
			System.out.println(key + " not found in array.");
	}
}
