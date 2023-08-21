//  Write a Java program that takes a year from user and print whether that year is a leap Year or Not..


package com.simple;

import java.util.Scanner;

public class LeapYearOrNot 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Year : ");
		int a=sc.nextInt();
		
		if(a%4==0)
		{
			System.out.println("This is Leap Year.."+a);
		}
		else 
		{
			System.out.println("This is Not Leap Year..");
		}
	}
}
