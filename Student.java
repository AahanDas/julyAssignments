package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName() {

		System.out.println("studentName Name: ");
	}

	public void studentDept() {

		System.out.println("studentDept Name: ");
	}

	public void studentId() {

		System.out.println("studentId Name: ");
	}
	
	public static void main(String[] args) {
		
		Student stdObj = new Student();
		stdObj.collegeCode();
		stdObj.collegeName();
		stdObj.collegeRank();
		
		stdObj.deptName();
		
		stdObj.studentName();
		stdObj.studentDept();
		stdObj.studentId();
	}

}
