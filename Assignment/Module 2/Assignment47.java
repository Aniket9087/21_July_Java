//	Write a Java program to create a new array list, add some colors (string) and print out the collection.

package com.assignment;

import java.util.ArrayList;

public class Assignment47 
{
	public static void main(String[] args)
	{
		ArrayList<String> colors=new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Green");
		
		System.out.println(colors);
	}
}
