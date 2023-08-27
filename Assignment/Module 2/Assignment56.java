//		Write a Java program to shuffle elements in an array list. 

package com.assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Assignment56 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> number=new ArrayList<Integer>();
		
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(4);
		number.add(5);
		
		Collections.shuffle(number);
		
		System.out.println("Shuffle"+number);
	}
}
