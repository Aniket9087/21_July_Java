//	Write a Java program to compare two array lists.

package com.assignment;

import java.util.ArrayList;

public class Assignment64 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list2.add(1);
		list2.add(2);
		list2.add(4);
		
		
		boolean isequal	=list1.equals(list2);
		
		System.out.println("Arraylists equal ?"+isequal);
	}
}
