//  Write a Java program to Take three numbers from the user and print the greatest number..


package com.simple;

import java.util.Scanner;

public class GreatestNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number1 : ");
		int a=sc.nextInt();
		System.out.println("Enter the Number2 : ");
		int b=sc.nextInt();
		System.out.println("Enter the Number3 : ");
		int c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("The Greatest Number is Number1.."+a);
		}
		else if(b>c && b>a)
		{
			System.out.println("The Greatest Number is Number2.."+b);
		}
		else
		{
			System.out.println("The Greatest Number is Number3.."+c);
		}
	}
}
