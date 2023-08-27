// Write a program which will ask the user to enter his/her marks (out of 100).
//Define a method that will display grades according to the marks
//entered as below:
//Marks Grade
//91-100 AA
//81-90 AB
//71-80 BB
//61-70 BC
//51-60 CD
//41-50 DD 
//40-Fail

package com.assignment;

import java.util.Scanner;

public class Assignment32_2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Marks: ");
		int marks=sc.nextInt();
		
		displayGrade(marks);
	}

	private static void displayGrade(int marks) 
	{
		// TODO Auto-generated method stub
		if(marks>=91 && marks<=100)
		{
			System.out.println("Grade:AA");
		}
		else if (marks>=81 && marks<=90)
		{
			System.out.println("Grade:AB");
		}
		else if (marks>=71 && marks<=80)
		{
			System.out.println("Grade:BB");
		}
		else if (marks>=61 && marks<=70)
		{
			System.out.println("Grade:BC");
		}
		else if (marks>=51 && marks<=60)
		{
			System.out.println("Grade:CD");
		}
		else if (marks>=41 && marks>=50)
		{
			System.out.println("Grade:DD");
		}
		else if(marks<40)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("invalid value.");
		}
	}
}
