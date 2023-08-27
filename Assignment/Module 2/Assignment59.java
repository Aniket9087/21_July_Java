//	Write a Java program to get the number of elements in a hash set. 

package com.assignment;

import java.util.HashSet;

public class Assignment59 
{
	public static void main(String[] args) 
	{	
		HashSet<String> fruit=new HashSet<String>();
		
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Orange");
		
		int size=fruit.size();
		
		System.out.println("Number of element into hash set."+size);
	}
}
