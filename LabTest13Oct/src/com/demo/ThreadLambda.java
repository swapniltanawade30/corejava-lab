/**
 * 
 */
package com.demo;

/**
 * @author Swapnil
 *
 */
public class ThreadLambda

{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Thread with lambda

		Runnable s1 = new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + " :thread is running");

			}

		};

		Thread b1 = new Thread(s1, "Swapnil123");
		System.out.println("------------Without Lambda------------");
		b1.start();

		// Thread with lambda

		Runnable s2 = () -> {
			System.out.println(Thread.currentThread().getName() + " :thread is running");
		};

		Thread b2 = new Thread(s2, "Abhi");
		System.out.println("------------With Lambda------------");
		b2.start();

	}

}
