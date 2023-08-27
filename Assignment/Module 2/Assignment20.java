//	• Create a class named 'Print Number' to print various numbers of different data types by creating different methods with the same name 'printn' having a parameter for each data type.

package com.assignment;

class PrintNumber
{
	public void printn(int number)
	{
		System.out.println("int number: "+number);
	}
	public void printn(double number)
	{
		System.out.println("Double number: "+number);
	}
	public void printn(float number)
	{
		System.out.println("Float number: "+number);
	}
}
public class Assignment20 
{
	public static void main(String[] args) 
	{
		PrintNumber p1=new PrintNumber();
		p1.printn(10);
		p1.printn(3.16);
		p1.printn(65.3f);
	}
}
