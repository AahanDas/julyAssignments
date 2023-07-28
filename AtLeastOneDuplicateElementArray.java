package week2.weekdayprograms;

public class AtLeastOneDuplicateElementArray {

	public static void main(String[] args) {

		
		int counter = 0;
		//int []arr = new int[] {1,1,1,3,3,4,3,2,4,2};
		//int []arr = new int[] {1,2,1,2,1,2,1,2};
		//int []arr = new int[] {1,1,1};
		//int []arr = new int[] {1,1,2};
		//int []arr = new int[] {1,2,3};
		int []arr = new int[] {1};
		
		for(int i=0; i<arr.length-1; i++) {
			
			for(int j=i+1; j<arr.length-1; j++) {
			
			if(arr[i] == arr[j]) {
				
				counter++;
			}
		}
		}
		
		if(counter>=1) {
			
			System.out.println("True");
		}
		else {
			
			System.out.println("False");
		}
		
	}

}
