/*
	 * Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (should match item in both arrays)
	 */

package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] arr1 = {3,2,11,4,6,7};
		int[] arr2 = {1,2,8,4,9,7};
		int len1 = arr1.length;
		int len2 = arr2.length;
		//int finalArray[] = new int[len1];
		
		for(int i=0; i<=len1-1; i++) {
			
			for(int j=0; j<=len2-1; j++) {
				
				
				if(arr1[i]==arr2[j]) {
					
					//finalArray[i] = arr1[i];
					System.out.print(arr1[i]+"\t");
					
				}
			}
		}
		
		
		/*
		 * for(int i=0; i<=finalArray.length-1; i++) {
		 * 
		 * System.out.println(finalArray[i]); }
		 */
		 
		
		
		
	}

}
