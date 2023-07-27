package week2.weekdayprograms;

import java.util.Arrays;

public class MajorityNumberMethod {

	public void findMajority(int[] arr) {
		Arrays.sort(arr);
		int len = arr.length;
		int counter = 0;

		int mid = len / 2;
		for (int i = 0; i <= len - 1; i++) {

			if (arr[i] == arr[mid]) {

				counter++;
			}
		}

		if (counter > mid) {

			System.out.println(arr[mid] + " is the Majority number and repeated " + counter + " times");
		} else {
			System.out.println("There is no Majority number in the given Array");

		}

	}

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 2, 1, 1, 1, 2, 2 }; // 1 1 1 2 2 2 2
		//int[] arr = new int[] { 2, 2, 2, 1, 1, 1 };
		//int[] arr = new int[] { 2, 2, 2, 2 };
		//int[] arr = new int[] { 2 };
		
		MajorityNumberMethod obj = new MajorityNumberMethod();
		obj.findMajority(arr);

	}

}
