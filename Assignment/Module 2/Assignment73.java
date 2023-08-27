//	Write a Java program to compare two sets and retain elements which are same on both sets. 

package com.assignment;

import java.util.HashSet;
import java.util.Set;

public class Assignment73 
{
	public static void main(String[] args)
	{
		Set<Integer> s1=new HashSet<Integer>();
		Set<Integer> s2=new HashSet<Integer>();
		
		s1.add(1);
		s1.add(2);
		s1.add(3);
		
		s2.add(2);
		s2.add(3);
		s2.add(4);
		
		s1.retainAll(s2);
		
		System.out.println("Retained elements"+s1);
	}
}
