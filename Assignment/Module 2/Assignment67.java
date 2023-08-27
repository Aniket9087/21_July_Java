//	Write a Java program to convert a hash set to an array.

package com.assignment;

import java.util.HashSet;

public class Assignment67 
{
	public static void main(String[] args)
	{
		HashSet<String> h=new HashSet<String>();
		
		h.add("Apple");
		h.add("Banana");
		h.add("Chiku");
		
		String[] array=h.toArray(new String[h.size()]);
		
		for(String element:array)
		{
			System.out.println(element);
		}
	}
}
