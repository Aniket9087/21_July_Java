package com.simple;

import java.util.Scanner;

public class VowelOrConsonant
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Alphabet : ");
		String a=sc.next();
		char ch=a.charAt(0);
		
		if(a.length()>1)
		{
			System.out.println("Error..");
		}
		else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		{
			System.out.println("Alphabet is Vowel..");
		}
		else
		{
			System.out.println("Alphabet is Consonant..");
		}
	}
}
