//   Write a Java program to count the letters, spaces, numbers and other characters of an input String..

package com.assignment;

public class Assignment8
{
	public static void count(String a)
	{
		char[] ch=a.toCharArray();
		int letter=0;
		int number=0;
		int space=0;
		int other=0;
		for(int i=0;i<a.length();i++)
		{
			if(Character.isLetter(ch[i]))
			{
				letter++;
			}
			else if(Character.isDigit(ch[i]))
			{
				number++;
			}
			else if(Character.isSpaceChar(ch[i]))
			{
				space++;
			}
			else
			{
				other++;
			}
		}
		System.out.println("Letter is :"+letter);
		System.out.println("Digit is :"+number);
		System.out.println("Space is :"+space);
		System.out.println("Other Is :"+other);
	}
	public static void main(String[] args) 
	{
		String test=("Plot No:83,Bharatnagar Chokdi,Bhavnagar,Gujarat,364002.");
		count(test);
		
	}
}
