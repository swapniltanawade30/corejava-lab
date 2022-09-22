/*
Program:  Write a  java program to create a BankAccount and display the people with balance less than 1000.

Code: Swapnil
Date: 22 september 2022
*/

//declaring a class Account

class Account
{
	//declaring instance variable
	
	private int accID;
	private String accName;
	private double accBalance;
	
	//default constructor no arg constructor
    Account()
	{
		
	}
	
	//parameterized constructor
	Account(int accId,String accName,double accBalance)
	{
		this.accId=accId;
		this.accName=accName;
		this.accBalance=accBalance;
		
	}
	
	//getters and setters for accId
	public int getAccId()
	{
		return this.accId;
	}
	
	public void setAccId(int accId)
	{
		this.accId=accId;
	}

	//getter and setter for accName 
	public String getAccName()
	{
		return this.accName;
	}