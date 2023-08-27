//	W.A.J.P to compare a given string to the specified character sequence. Comparing topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false

package com.assignment;

public class Assignment15 
{
	public static void main(String[] args)
	{
		String String1="topsint.com";
		String String2="topsint.com";
		
		String String3="Topsint.com";
		String String4="topsint.com";
		
		boolean equal1=String1.equals(String2);
		
		boolean equal2=String3.equals(String4);
		
		System.out.println("Comparing of String"+String1+"and"+String2+" "+equal1);
		
		System.out.println("Comparing of String"+String3+"and"+String4+" "+equal2);
	}
}
