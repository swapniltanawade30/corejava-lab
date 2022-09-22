/*
Program : creating class SbiBank to create accounts
Code:Swapnil
Date : 22 september 2022
*/

//declaring class CanaraBank

class CanaraBank
{
	//main method
	public static void main(String ...args)
	{
		//-------Constructor injection ------//tight coupling
		
		//declaring objects of Account class
		Account acc1= new Account(11001,"Abhi ",6900.0);
		Account acc2= new Account(11002,"Amish ",1000.0);
		
		if(accBalance<1000)
		{
			System.out.println("You Need Minimum Account Balance :"+ getAccBalance)
		}
		
		// displaying the account
		System.out.println("Account ID:  "+acc1.getAccID()+"   Name:   "+acc1.getAccName()+"  Balance:  "+acc1.getAccBalance());
		System.out.println("Account ID:  "+acc2.getAccID()+"   Name:   "+acc2.getAccName()+"  Balance:  "+acc2.getAccBalance());
	    //declaring objects
		Account acc3= new Account();
		
		//setting the values of the object
		acc3.setAccID(7890);
		acc3.setAccName("sairaj");
		acc3.setBalance(68098.98);
		
		//getting the values
		System.out.println("Account ID:  "+acc3.getAccID()+"   Name:   "+acc3.getAccName()+"  Balance:  "+acc3.getBalance());
	}
	
}
		
		}
	
}