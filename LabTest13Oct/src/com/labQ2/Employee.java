/**
 * 
 */
package com.labQ2;

/**
 * @author Swapnil
 *
 */
public class Employee {
	// creating properties
	private int id;
	private String ename;
	private String section;
	private String email;
	private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String ename, String section, String email, double salary) {
		super();
		this.id = id;
		this.ename = ename;
		this.section = section;
		this.email = email;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getsection() {
		return section;
	}

	public void setsection(String section) {
		this.section = section;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double grossSalary(double... salary) {
		double grossEarning = 20000;
		double incomeTax = 2000;
		double providentFund = 1000;
		double professionalTax = 600;
		double netSalary = grossEarning - (incomeTax + providentFund + professionalTax);
		System.out.println("Net Salary is=" + netSalary);
		return grossEarning;
	}
}