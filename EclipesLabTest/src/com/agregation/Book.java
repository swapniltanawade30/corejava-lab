/**
 * 
 */
package com.agregation;

/**
 * @author Swapnil
 *
 */
//declaring class
public class Book {
	private String bookName;
	private double bookPrice;
	private Author auth;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, double bookPrice, Author auth) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.auth = auth;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Author getAuth() {
		return auth;
	}

	public void setAuth(Author auth) {
		this.auth = auth;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + ", auth=" + auth + "]";
	}

}
