//	Take two numbers from the user and perform the division operation and handle Arithmetic Exception. O/P- Enter two numbers: 10 0

package com.assignment;

import java.util.Scanner;

public class Assignment35
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Numbers: ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		try 
		{
			int result=num1/num2;
			System.out.println("Result: "+result);
		} catch (ArithmeticException e)
		{
			System.out.println("Error..");
			// TODO: handle exception
		}
	}
}
