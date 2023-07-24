package week2.weekdayprograms;

public class SquareRoot {
	
	
	public static void squareRoot(int number) {
		
		
		double temp;
		int sr = number/2;
		
		do {
			
			temp = sr;
			sr = (int) ((temp+(number/temp))/2);
		}while((temp-sr)!=0);
		System.out.println(sr);
		
	}

	public static void main(String[] args) {

		
		int num = 5;
		System.out.println("Square root of number:"+num);
		
		squareRoot(num);
	}

}
