/**
 * 
 */
package com.labQ2;

/**
 * @author Swapnil
 *
 */
public class HourlyEmployee extends Employee {
	private String ename;
	private int hours;
	private double rate, pay;

	public HourlyEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HourlyEmployee(int id, String ename, String department, String email, double salary) {
		super(id, ename, section, email, salary);
		// TODO Auto-generated constructor stub
		this.ename = ename;
		this.hours = hours;
		this.pay = pay;
		this.rate = rate;

	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public double calculatePay(int hours, double rate) {
		if (hours > 40) {
			int extraHours = hours - 40;
			pay = (40 * rate) + (extraHours * rate);
		} else
			pay = hours * rate;

		return pay;
	}

	public void displayEmployee() {
		System.out.printf("Employee's name: " + ename);
		System.out.printf("Gross Salary: ", +pay);
	}

}
