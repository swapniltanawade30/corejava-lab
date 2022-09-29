/**
 * 
 */
package com.Varargs;

/**
 * @author Swapnil
 *
 */
public class EvenOdd {

	// method to print array
	static void printEvenNumber(int[] arr) {
		System.out.println("----Even Numbers----");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}

	static void printOddNumber(int[] arr1) {
		System.out.println("----Odd Numbers----");
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] % 2 != 0) {
				System.out.println(arr1[i]);
			}
		}
	}

	public static void main(String... args) {
		int arr[] = { 2, 6, 10 };
		int arr1[] = { 1, 5, 3 };

		printEvenNumber(arr);
		printOddNumber(arr1);

	}
}