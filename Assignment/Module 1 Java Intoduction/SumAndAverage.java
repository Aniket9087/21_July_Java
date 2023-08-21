//	Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop.

package com.simple;

import java.util.Scanner;

public class SumAndAverage
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int[] a= new int [5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the Number : ");
			a[i]=sc.nextInt();
		}
		int n=0;
		for(int i=0;i<5;i++)
		{
			n=n+a[i];
		}
		System.out.println("Sum of All Number is.."+n);
		
		int avg;
		avg=n/5;
		System.out.println("Average of All Number is.."+avg);
	}
}
