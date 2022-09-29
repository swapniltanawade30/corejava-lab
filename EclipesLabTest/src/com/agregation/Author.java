/**
 * 
 */
package com.agregation;

/**
 * @author Swapnil
 *
 */

public class Author extends Book {
	private String authorName;
	private double dateOfBirth;
	private String eduction;

	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Author(String authorName, double dateOfBirth, String eduction) {
		super();
		this.authorName = authorName;
		this.dateOfBirth = dateOfBirth;
		this.eduction = eduction;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public double getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(double dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEduction() {
		return eduction;
	}

	public void setEduction(String eduction) {
		this.eduction = eduction;
	}

	@Override
	public String toString() {
		return "Author [authorName=" + authorName + ", dateOfBirth=" + dateOfBirth + ", eduction=" + eduction + "]";
	}

}
