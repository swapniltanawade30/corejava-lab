/**
 * 
 */
package com.inherited;

/**
 * @author Swapnil
 *
 */
public class Student {
	private String name;
	private int rollno;
	private double avgMarks;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollno, double avgMarks) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.avgMarks = avgMarks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public double getAvgMarks() {
		return avgMarks;
	}

	public void setAvgMarks(double avgMarks) {
		this.avgMarks = avgMarks;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", avgMarks=" + avgMarks + "]";
	}

}
