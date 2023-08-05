package org.interfacePractice;

public class Automation extends MultipleLangauge {

	public void selenium() {
		System.out.println("Selenium Method implemented in Automation class");
	}

	public void java() {
		System.out.println("Java Method implemented in Automation class");
	}

	@Override
	public void ruby() {
		System.out.println("Ruby Method implemented in Automation class");
	}

	public static void main(String[] args) {

		Automation automObj = new Automation();
		automObj.selenium();
		automObj.java();
		automObj.ruby();
		automObj.python();

	}

}
