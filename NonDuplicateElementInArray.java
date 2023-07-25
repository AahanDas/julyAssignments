package week2.weekdayprograms;

import java.util.Arrays;

public class NonDuplicateElementInArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 1, 2, 1, 3 };
		Arrays.sort(arr); // 1 1 2 2 3

		int len = arr.length;
		// System.out.println(len);

		for (int i = 0; i < len; i++) {

			int counter = 0;
			for (int j = 0; j < len; j++) {

				if (arr[j] == arr[i]) {
					counter++;
				}

			}
			if (counter == 1) {

				System.out.println(arr[i]);
			}
		}
	}

}
