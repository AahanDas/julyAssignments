//int[] arr = {1,2,3,4,7,6,8};

// Sort the array	

// loop through the array (start i from arr[0] till the length of the array)

// check if the iterator variable is not equal to the array values respectively

// print the number

// once printed break the iteration

package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int len = (arr.length)+1;
		//System.out.println(len);
		
		int sum = (len*(len+1))/2;
		//System.out.println(sum);
		
		int tempSum = 0;
		for(int i=0; i<=arr.length-1; i++) {
			tempSum= tempSum+arr[i];
			
		}
		//System.out.println(tempSum);
		
		int MissingNumber = sum-tempSum;
		
		System.out.println("Missing number in the Array is: "+MissingNumber);
		
	}

}
