// 	W.A.J. P to demonstrate try catch block

package com.assignment;

public class Assignment34 
{
	public static void main(String[] args)
	{
		try 
		{
			int [] number= {1,2,3};
			System.out.println(number[4]);
		} catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println(" "+e.getMessage());
			// TODO: handle exception
		}
	}
}
