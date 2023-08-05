package week3.day1;

public class SmartPhone extends AndroidPhone {
	
public void takeVideo() {
		
		System.out.println("takeVideo from SmartPhone Class");
		
	}

public void video() {
	
	System.out.println("Calling Parent class Method");
	super.takeVideo();
	
}


public static void main(String[] args) {
	
	
	SmartPhone smrtPhoneObj = new SmartPhone();
	
	smrtPhoneObj.takeVideo();
	smrtPhoneObj.video();
}




}
