//	W.A.J. P to demonstrate try catch block, take two numbers from the user by
//Command line argument and perform the division operation and handle Arithmetic
//O/PException in thread main java. Lang. Arithmetic Exception:/ by zero

package com.assignment;

public class Assignment38 
{
	public static void main(String[] args)
	{
		try 
		{
			int num1=Integer.parseInt(args[0]);
			int num2=Integer.parseInt(args[1]);
			
			int result=num1/num2;
			
			System.out.println("Reuslt: "+result);
		} catch (ArithmeticException e) 
		{
			System.out.println("Error.Division by zero is not allowed");
			// TODO: handle exception
		} catch (NumberFormatException e)
		{
			System.out.println("Invalid input");
		} catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Error.Not enough arguments.");
		}
	}
}
