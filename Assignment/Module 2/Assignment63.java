//	Write a Java program to extract a portion of an array list.

package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment63 
{
	public static void main(String[] args)
	{
		ArrayList<String> fruit=new ArrayList<String>();
		
		fruit.add("Apple");
		fruit.add("Chiku");
		fruit.add("Banana");
		fruit.add("Mango");
		fruit.add("Grapes");
		
		List<String> portion=fruit.subList(1, 4);
		
		System.out.println("Portion"+portion);
	}
}
