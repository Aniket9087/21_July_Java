//	Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
//having a method with the same name 'message' that prints "This is first subclass"
//and "This is second subclass" respectively. Call the methods 'message' by creating
//an object for each subclass.

package com.assignment;

abstract class parent1
{
	abstract void message();
}
class FFirstsubclass extends parent1
{

	@Override
		void message() 
	{
		System.out.println("This is First Sub Class..");
	}
}
class Secondsubclass extends parent1
{

	@Override
		void message() 
	{
		System.out.println("This is Second Sub Class..");
	}
}
public class Assignment28 
{
	public static void main(String[] args)
	{
		FFirstsubclass f1=new FFirstsubclass();
		f1.message();
		
		Secondsubclass s1=new Secondsubclass();
		s1.message();
	}
}
