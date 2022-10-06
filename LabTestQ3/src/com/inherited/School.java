/**
 * 
 */
package com.inherited;

/**
 * @author Swapnil
 *
 */
public class School extends Student {
	private double avgMarks;
	public int standard;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(String name, int standard, float avgMarks) {
		super(name, standard, avgMarks);
		// TODO Auto-generated constructor stub
	}

	public School(float avgMarks, int standard) {
		super();
		this.avgMarks = avgMarks;
		this.standard = standard;
	}

	public double getAvgMarks() {
		return avgMarks;
	}

	public void setAvgMarks(double avgMarks) {
		this.avgMarks = avgMarks;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	@Override
	public String toString() {
		return "School [avgMarks=" + avgMarks + ", standard=" + standard + ", getAvgMarks()=" + getAvgMarks()
				+ ", getStandard()=" + getStandard() + "]";
	}

}
