//	W.A.J.P to create a custom exception if Customer withdraw amount which is greater
//than account balance then program will show custom exception otherwise amount
//will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
//2500
//Sorry, insufficient balance, you need more 500 Rs. To perform this transaction.
package com.assignment;

class InsuffiecientBalanceException extends Exception
{
	public InsuffiecientBalanceException(String message)
	{
		super(message);
	}
}
class Account
{
	int balance;
	
	public Account(int balance)
	{
		this.balance=balance;
	}
	
	public void withdraw(int amount) throws InsuffiecientBalanceException
	{
		if (amount>balance)
		{
			throw new InsuffiecientBalanceException("Sorry, insufficient balance.You need more"+(amount-balance)+"Rs.to perform this transaction.");
		}
		else
		{
			balance-=amount;
			System.out.println("Amount deducted from account balance");
		}
	}
}
public class Assignment40
{
	public static void main(String[] args)
	{
		Account a=new Account(2000);
		int withdrawamount=2500;
		
		try 
		{
			a.withdraw(withdrawamount);
		} catch (InsuffiecientBalanceException e)
		{
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}
}
