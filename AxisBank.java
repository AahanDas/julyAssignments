package org.bank;

public class AxisBank extends BankInfo {
	
	
	public void deposit() {

		System.out.println("deposit from AxisBank Class");
	}
	public void commondeposit() {

		super.deposit();
	}
	
	public static void main(String[] args) {
		
		AxisBank axisObj = new AxisBank();
		axisObj.deposit();
		//axisObj.commondeposit();
	}
	

}
