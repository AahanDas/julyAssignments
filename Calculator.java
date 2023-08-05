package week3.day1;

public class Calculator {

	public static int add(int a, int b) {
		System.out.println("2 Argument Add method");
		return a + b;
	}

	public static int add(int a, int b, int c) {
		System.out.println("3 Argument Add method");

		return a + b + c;
	}
	
	public static double multiple(double a, double b) {
		System.out.println("2 Argument with double Multiple  method");
		return a * b;
	}
	
	public static float multiple(float a, float b) {
		System.out.println("2 Argument with float Multiple  method");
		return a * b;
	}

	public static void main(String[] args) {

		Calculator calcObj = new Calculator();
		int add1 = calcObj.add(44, 44);
		System.out.println(add1);
		int add2 = calcObj.add(4, 32, 28);
		System.out.println(add2);
		
		double add3 = calcObj.multiple(12.111, 14.888);
		System.out.println(add3);
		
		double add4 = calcObj.multiple(18.1f, 14.88f);
		System.out.println(add4);
	}

}
