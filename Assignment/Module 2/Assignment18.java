//	W.A.J.P to find all interleaving of given strings. 

package com.assignment;

import java.util.ArrayList;
import java.util.List;

public class Assignment18
{
	public static void main(String[] args) 
	{
		String String1="WX";
		String String2="YZ";
	
		List<String> interleavings = findinterleavings(String1, String2);
		System.out.println("The given Strings are: "+String1+" "+String2);
		System.out.println("The interleaved String are:"+interleavings);
		
		
	}

	private static List<String> findinterleavings(String string1, String string2)
	{
		List<String> interleavings = new ArrayList<>();
		if(string1.isEmpty())
		{
			interleavings.add(string2);
			return interleavings;
		}
		
		if(string2.isEmpty())
		{
			interleavings.add(string1);
			return interleavings;
		}
		
		char firstchar1 = string1.charAt(0);
		List<String> interleavings1 = findinterleavings(string1.substring(1), string2);
		for(String interleaved:interleavings1)
		{	
			interleavings.add(firstchar1+interleaved);
		}
		
		char firstchar2 = string1.charAt(0);
		List<String> interleavings2 = findinterleavings(string1,string2.substring(1));
		for(String interleaved:interleavings2)
		{
			interleavings.add(firstchar2+interleaved);
		}
		
		return interleavings;
	}
}