//	Write a Java program to check whether a map contains key-value mappings (empty) or not.

package com.assignment;

import java.util.HashMap;
import java.util.Map;

public class Assignment69
{
	public static void main(String[] args) 
	{
		Map<String, Integer> m=new HashMap<String, Integer>();
		
		if(m.isEmpty())
		{
			System.out.println("The map is Empty..");
		}
		else
		{
			System.out.println("The map is not Empty..");
		}
	}
}