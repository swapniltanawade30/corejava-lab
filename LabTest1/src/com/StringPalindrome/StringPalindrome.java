/**
 * 
 */
package com.StringPalindrome;

import java.util.Scanner;

/**
 * @author Swapnil
 *
 */
public class StringPalindrome {

	// creating method
	static boolean checkPalindrome(String str) {
		boolean status;
		char ch[] = str.toCharArray();
		String revstrString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revstrString += ch[i];
		}
		int flag = str.compareTo(revstrString);
		if (flag == 0)
			status = true;
		else
			status = false;

		return status;
	}

	// calling main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String :");
		String s = sc.next();
		boolean check = checkPalindrome(s);
		if (check) {
			System.out.println("----The String is a palindrom----");
		} else
			System.out.println("----The String is not a palindrom----");
		sc.close();

	}
}
