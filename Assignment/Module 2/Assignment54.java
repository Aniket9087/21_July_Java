// 	Write a Java program to sort a given array list. 

package com.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment54 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> number=new ArrayList<Integer>();
		
		number.add(5);
		number.add(2);
		number.add(8);
		number.add(1);
		
		Collections.sort(number);
		
		System.out.println("Sort"+number);
	}
}
