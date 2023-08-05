package org.student;

public class Students {

	public void getStudentInfo(int id) {

		System.out.println("Student Id: " + id);

	}

	public void getStudentInfo(int id, String name) {

		System.out.println("Student Id: " + id+" And Student Name: " + name);

	}

	public void getStudentInfo(String email, Long phoneNumber) {

		System.out.println("Student email: " + email +" And Student phone number: " + phoneNumber);

	}

	public static void main(String[] args) {
		
		Students stdObj = new Students();
		stdObj.getStudentInfo(1001);
		stdObj.getStudentInfo(1002, "Aahan");
		stdObj.getStudentInfo("mrdipti@gmail.com", 8888888888l);
		

	}

}
