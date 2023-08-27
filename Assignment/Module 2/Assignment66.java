//	Write a Java program to join two array lists.

package com.assignment;

import java.util.ArrayList;

public class Assignment66
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		
		ArrayList<Integer> joinlist=new ArrayList<Integer>();
		
		joinlist.addAll(list2);
		
		System.out.println("Joined Arraylist"+joinlist);
	}
}
