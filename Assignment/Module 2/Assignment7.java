//	Write a Java program that reads a positive integer and count the number of digits the number.

package com.assignment;

import java.util.Scanner;

public class Assignment7 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Integer Number.. : ");
		long number=sc.nextLong();
		int count=0;
		
		if(number==0)
		{
			count=1;
		}
		else
		{
			while(number !=0)
			{
				number/=10;
				count++;
			}
		}
		System.out.println("Number of digits in the number.."+count);
	}
}
