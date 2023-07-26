package week2.weekdayprograms;

public class HappyNumber {
	
	public static int findHappyNumber(int num) {
		
		int rem = 0;
		int sum = 0;
		
		while(num!=0) {
			rem = num%10;
			sum = sum+(rem*rem);
			num = num/10;
		}
		return num;
	}

	public static void main(String[] args) {

		
		
		int number = 15;
		int result = number;
		while(result!=1 && result!=4) {
			
			
			result = findHappyNumber(result);
		}
		
		if(result == 1) {
			System.out.println(number+" is a Happy number");
		}else {
			System.out.println(number+" is not a Happy number");
		}
	}

}
