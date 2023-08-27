//		Write a Java program to append the specified element to the end of a hash set.

package com.assignment;

import java.util.HashSet;

public class Assignment57 
{
	public static void main(String[] args) 
	{
		HashSet<String> fruit=new HashSet<String>();
		
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Orange");
		
		String newfruit="Mango";
		
		fruit.add(newfruit);
		
		System.out.println("Update"+fruit);
	}
}
