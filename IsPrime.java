package week1.day1;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a posive integer");
		int num = sc.nextInt();
		
		boolean flag = false;
		
		for(int i=2; i<=num/2; i++) {
			if(num%i==0) {
				
				
				flag = true;
				break;
			}
		}
		if(!flag) {
			
			System.out.println("Number " +num+ " is  a Prime number");
		}else {
			
			System.out.println("Number " +num+ " is not a Prime number");
		}
		
	}

}
