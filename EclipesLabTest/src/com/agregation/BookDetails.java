/**
 * 
 */
package com.agregation;

/**
 * @author Swapnil
 *
 */
public class BookDetails {
	static void display(Book b) {
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book("Chandalika", 409.8, new Author("Rabindranath Tagore", 7 / 1861, " Law and barrister"));
		Book b2 = new Book("A Secular Agenda", 300.8, new Author("Arun Shourie", 2 / 1941, " Bachelor's in Economics"));
		Book b3 = new Book("By God's Decree", 550.8, new Author("Kapil Dev", 6 / 1959, " indian Former Crickter"));

		System.out.println("Book Deatails :");

		display(b1);
		display(b2);
		display(b3);
	}

}
