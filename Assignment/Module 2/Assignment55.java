//	Write a Java program to copy one array list into another.

package com.assignment;

import java.util.ArrayList;

public class Assignment55
{
	public static void main(String[] args)
	{
		ArrayList<Integer> List =new ArrayList<Integer>();
		
		List.add(1);
		List.add(2);
		List.add(3);
		
		ArrayList<Integer> List2=new ArrayList<Integer>();
		
		for(int num:List)
		{
			List2.add(num);
		}
		
		System.out.println("Array list."+List2);
	}
}
