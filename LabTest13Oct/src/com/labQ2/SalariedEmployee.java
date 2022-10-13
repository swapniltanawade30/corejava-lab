/**
 * 
 */
package com.labQ2;

/**
 * @author Swapnil
 *
 */
public class SalariedEmployee extends Employee {
	private String section;
	private double grossEarning;

	public SalariedEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SalariedEmployee(int id, String ename, String section, String email, double salary) {
		super(id, ename, section, email, salary);
		// TODO Auto-generated constructor stub
		this.section = section;
		this.grossEarning = grossEarning;

	}

	// getter setter
	public String getDepartment() {
		return section;
	}

	public void setDepartment(String department) {
		this.section = section;
	}

	public double grossEarning() {
		return grossEarning;
	}

	public void setgrossEarning(double grossEarning) {
		this.grossEarning = grossEarning;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [department=" + section + ",grossEarning=" + grossEarning + "]";
	}
}
