//	W.A.J.P to get the character at the given index within the String. Original String = Tops Technologies! The character at position 0 is T, The character at position 10 is o

package com.assignment;

public class Assignment13 
{
	public static void main(String[] args)
	{
		String String = "Tops Technologies";
		int value1=0;
		int value2=10;
		
		char charAtValue1=String.charAt(value1);
		char charAtValue2=String.charAt(value2);
		
		System.out.println("The Character at Position"+value1+"is"+charAtValue1);
		
		System.out.println("The Character at Position"+value2+"is"+charAtValue2);
	}
}
