//	Write a Java program to update specific array element by given element.

package com.assignment;

public class Assignment51
{
	public static void main(String[] args) 
	{
		int [] numbers= {1,2,3,4,5};
		
		int index=2;
		
		int newelement=10;
		
		numbers[index]=newelement;
		
		for(int number:numbers)
		{
			System.out.println(number);
		}
	}
}
