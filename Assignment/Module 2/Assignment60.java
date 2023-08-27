//	Write a Java program to associate the specified value with the specified key in a Hash Map. 

package com.assignment;

import java.util.HashMap;

public class Assignment60 
{
	public static void main(String[] args)
	{
		HashMap<String, Integer> age=new HashMap<String, Integer>();
		
		age.put("Aniket", 21);
		age.put("Dilip", 20);
		age.put("Shivarsh", 22);
		
		System.out.println("Hash map"+age);
	}
}
