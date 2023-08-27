// 	• Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
//$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'
//are subclasses of class 'Bank', each having a method named 'getBalance'. Call this
//method by creating an object of each of the three classes.

package com.assignment;

abstract class Bank
{
	abstract int getbalance();
}
class BankA extends Bank
{
	@Override
	int getbalance()
	{
		return 100;
	}	
}
class BankB extends Bank
{
	@Override
	int getbalance() 
	{
		return 150;
	}
}
class BankC extends Bank
{
	@Override
	int getbalance() 
	{
		return 200;
	}
}
public class Assignment29
{
	public static void main(String[] args)
	{
		BankA A=new BankA();
		BankB B=new BankB();
		BankC C=new BankC();
		
		int BA =A.getbalance();
		int BB =B.getbalance();
		int BC =C.getbalance();
		
		System.out.println("Balance in bank A:$"+BA);
		System.out.println("Balance in bank B:$"+BB);
		System.out.println("Balance in bank C:$"+BC);
	}
}
