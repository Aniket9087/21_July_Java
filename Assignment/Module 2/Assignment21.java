// 	Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.

package com.assignment;

class PrintIntegerCharacter
{
	public void print(int n,char c)
	{
		System.out.println("Integer and Character.."+n+" "+c);
	}
	public void print(char c,int n)
	{
		System.out.println("Integer and Character.."+c+" "+n);
	}
}
public class Assignment21 
{
	public static void main(String[] args) 
	{
		PrintIntegerCharacter p1=new PrintIntegerCharacter();
		p1.print(10, 'A');
		p1.print('B', 20);
	}
}
