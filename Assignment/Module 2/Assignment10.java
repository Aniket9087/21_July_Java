//	Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn. Input number: 5 5 + 55 + 555 

package com.assignment;

import java.util.Scanner;

public class Assignment10 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n=sc.nextInt();
		
		int result= n+(n*11)+(n*111);
		System.out.println(n+"+"+(n*11)+"+"+(n*111)+"="+result);
	}
}
