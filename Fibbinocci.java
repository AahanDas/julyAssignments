package week1.day1;

public class Fibbinocci {
	
	public static void main(String[] args) {
		
		
		int number = 11;
		fibonacci(number);
	
	}

	static void fibonacci(int number) {

		
		int num1 = 0, num2 = 1;
		int counter = 0;
		while(counter < number) {
			
			System.out.print(num1+ " ");
			int sum = num1+num2;
			num1 = num2;
			num2 = sum;
			counter = counter+1;
		}
	}

}
