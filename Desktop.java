package org.system;

public class Desktop extends Computer {
	
	public void ownMethodDesktop() {
		
		System.out.println("ownMethodDesktop MEthod");
	}
	
	public static void main(String[] args) {
		
		Desktop deskObj = new Desktop();
		deskObj.computerModel();
		//deskObj.ownMethodDesktop();
	}

}
