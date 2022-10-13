/**
 * 
 */
package com.LabtestQ4;

import java.util.Scanner;

/**
 * @author Swapnil
 *
 */
public class StudentDetails {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter :");
		try {
			// converting string to int
			String s = sc.next();
			int i = Integer.parseInt(s);
			// division
			int d = 89 / i;
			System.out.println(d);
		} catch (NumberFormatException e) {
			System.out.println("The String is not a number");
		} catch (Exception m) {
			System.out.println(m);
		}
		// multiple catch block
		System.out.println("Enter a Name :");
		String str = sc.next();
		System.out.println(str);

		sc.close();
	}

}