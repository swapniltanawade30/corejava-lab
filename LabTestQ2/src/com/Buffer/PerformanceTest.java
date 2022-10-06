/**
 * 
 */
package com.Buffer;

/**
 * @author Swapnil
 *
 */
public class PerformanceTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long stTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("Swapnil");

		for (int i = 0; i < 2000000; i++) {
			sb.append('t');
		}

		long timeTaken = System.currentTimeMillis() - stTime;

		System.out.println("Time taken by StringBuffer:" + timeTaken);

		stTime = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("Swapnil");

		for (int i = 0; i < 2000000; i++) {
			sb1.append('s');
		}

		timeTaken = System.currentTimeMillis() - stTime;

		System.out.println("Time taken by StringBuilder:" + timeTaken);

	}

}
