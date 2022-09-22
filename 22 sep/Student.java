/*
Program : Write a Student and create an array of 10 students and display the students whose marks are more than 90%
Code:Swapnil
Date : 22 september 2022
*/

import java.util.Scanner;

//declaring class student
class Student
 {
	String name;
	int score;
	
// no args consturctor
 Student() 
 {
		
}
//parameterize constructor
Student(String initName, int initScore)
 {
		this.name = initName;
		this.score = initScore;
	}
}
//declaring class marks
class Marks 
{
	//calling main method
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input number of students:");
		
		//taking input
		int n = Integer.parseInt(in.nextLine().trim());
		System.out.println("Input Student Name:");
		System.out.println("Input Score:");
		Student stu = new Student();
		Student max = new Student(90);
		
		for (int i = 0; i < n; i ++) 
		{
			stu.name = in.next();
			stu.score = in.nextInt();
			if (max < stu) 
			{
				max.name = stu.name;
				max = stu;
			}
			
		}
		//print highest score
		System.out.println("Name of the highest score :");

		System.out.println(max.name + " ");
		
	}
}