//RepeatedSubtractionMethod
// num-1, num-3, num-5, num-7 --> 



package week2.weekdayprograms;

public class SquareRootinRepeatedSubtractionMethod {

	public static void main(String[] args) {
		
		
		
		int num = 325;
		//int temp = num;
		int counter = 1;
		for(int i=1; i<=num; i+=2) {
			
			num = num-i; 
			counter++ ;
			
			if(num==0) {
				break;
			}
			
			
		}
		System.out.println(counter-1);
		
	}
}
