//	W.A.J.P to check whether a given string starts with the contents of another string.Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts with Red? False I3. 

package com.assignment;

public class Assignment17 
{
	public static void main(String[] args) 
	{
		String String1="Red is favorite colour";
		String String2="Red";
		
		String String3="Orange is also my favorite colour";
		String String4="Red";
		
		boolean startwith1=String1.startsWith(String2);
		boolean startwith2=String3.startsWith(String4);
		
		
		int startswith = 0;
		System.out.println(" "+String1+" "+startswith+" "+String2+" "+startwith1);
		
		System.out.println(" "+String3+" "+startswith+" "+String4+" "+startwith2);
	}
}
