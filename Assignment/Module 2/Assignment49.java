//	Write a Java program to insert an element into the array list at the first position.

package com.assignment;

import java.util.ArrayList;

public class Assignment49
{
	public static void main(String[] args)
	{
		ArrayList<String> colors=new ArrayList<String>();
		
		colors.add("Red");
		colors.add("Yellow");
		colors.add("Green");
		
		colors.add(0, "Blue");
		
		System.out.println(colors);
	}
}
