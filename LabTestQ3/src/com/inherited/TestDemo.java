/**
 * 
 */
package com.inherited;

/**
 * @author Swapnil
 *
 */
//declaring class
public class TestDemo {
	static void display(Student s) {

		System.out.println("Student Name:" + s.getName());
		System.out.println("rollno:" + s.getRollno());
		System.out.println("Avargae Marks :" + s.getAvgMarks());

		System.out.println(s);
	}

	// calling main method
	public static void main(String... args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Swapnil", 35, 80.09);
		Student s2 = new Student("Sangram", 37, 90.09);
		Student s3 = new Student("Abhi", 56, 91.09);
		Student s4 = new Student("Vaibhav", 21, 75.09);

		System.out.println("Details are:");

		display(s1);
		display(s2);
		display(s3);
		display(s4);

	}

}
