//	Write a Java program to increase the size of an array list.

package com.assignment;

import java.util.ArrayList;

public class Assignment70 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		
		a.ensureCapacity(10);
		
		System.out.println("Updated size of array list."+a.size());
	}
}
