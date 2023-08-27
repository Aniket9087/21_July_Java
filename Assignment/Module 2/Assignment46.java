//	Write a Java program to create a new array list, add some colors (string) and print out the collection.

package com.assignment;
import java.util.ArrayList;
public class Assignment46 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<String>();

		a1.add("Red");
		a1.add("Yellow");
		a1.add("Orange");
		a1.add("Green");
		a1.add("Blue");
		System.out.println("First ArrayList"+a1);

		a1.add(0, "Black");
		System.out.println("Second ArryList"+a1);

	}
}
