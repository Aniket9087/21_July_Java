//	W.A.J.P to create the validate method that takes integer value as a parameter. If the
//age is less than 18, then throw an Arithmetic Exception otherwise print a message
//welcome to vote.
//O/P- Enter your age: 16
//Exception in thread main java. Lang. Arithmetic Exception: not valid 

package com.assignment;

import java.util.Scanner;

public class Assignment39
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		try 
		{
			valid(age);
			System.out.println("Welcome to vote..");
		} catch (ArithmeticException e)
		{
			System.out.println("Not valid.");
			// TODO: handle exception
		}
	}

	private static void valid(int age) 
	{
		if(age<15)
		{
			throw new ArithmeticException("Not valid.");
		}
		// TODO Auto-generated method stub	
	}
}
