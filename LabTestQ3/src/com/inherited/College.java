/**
 * 
 */
package com.inherited;

/**
 * @author Swapnil
 *
 */

public class College extends Student {

	private double avgMarks;
	public int rollno;

	public College() {
		super();
		// TODO Auto-generated constructor stub
	}

	public College(double avgMarks, int standard) {
		super();

		this.avgMarks = avgMarks;
		this.rollno = standard;
	}

	public double getAvgMarks() {
		return avgMarks;
	}

	public void setAvgMarks(double avgMarks) {
		this.avgMarks = avgMarks;
	}

	public int getrollno() {
		return rollno;
	}

	public void setStandard(int standard) {
		this.rollno = standard;
	}

	@Override
	public String toString() {
		return "college [avgMarks=" + avgMarks + ", standard=" + rollno + ", getAvgMarks()=" + getAvgMarks()
				+ ", getStandard()=" + getrollno() + "]";
	}

}
