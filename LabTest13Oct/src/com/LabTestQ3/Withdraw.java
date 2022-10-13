/**
 * 
 */
package com.LabTestQ3;

/**
 * @author Swapnil
 *
 */
public class Withdraw extends Account {
	private Account acct = new Account();

	public static void main(String[] args) {
		Withdraw r = new Withdraw();
		Thread one = new Account();
		Thread two = new Account(r);
		one.setName("Swapnil");
		two.setName("Abhi");
		one.start();
		two.start();
	}

	@Override
	public void run() {
		for (int x = 0; x < 5; x++) {
			makeWithdrawal(10);
			if (acct.getBalance() < 0) {
				System.out.println("account is overdrawn!");
			}
		}
	}

	private void makeWithdrawal(int amt) {
		if (acct.getBalance() >= amt) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw");
			try {
				Thread.sleep(100);
			} catch (InterruptedException ex) {
			}
			acct.withdraw(amt);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal");
		} else {
			System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw "
					+ acct.getBalance());
		}
	}
}
