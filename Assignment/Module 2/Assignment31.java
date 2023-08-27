//	Write a program to print the factorial of a number by defining a method named
//'Factorial'. Factorial of any number n is represented by n! And is equal to 1*2*3*.
//*(n-1) *n. E.g.-
//4! = 1*2*3*4 = 24
//3! = 3*2*1 = 6
//2! = 2*1 = 2
//Also, 1! = 1
//0! = 0 

package com.assignment;

import java.util.Scanner;
class Factorial
{
	public int getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int number=sc.nextInt();
		int fact=1;
		if(number==0)
		{
			fact=1;
		}
		else
		{
			for(int i=1;i<=number;i++)
			{
				fact=fact*i;
			}
		}
		return fact;
	}
}
public class Assignment31
{
	public static void main(String[] args)
	{
		Factorial f1=new Factorial();
		System.out.println("Factorial Of Input Number is "+f1.getData());
	}
}
