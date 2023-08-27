//	Create a class with a method that prints "This is a parent class" and its subclass with
//another method that prints "This is child class". Now, create an object for each of
//the class and call 1 - method of parent class by object of parent class 2 - method of
//child class by object of child class 3 - method of parent class by object of child class

package com.assignment;

class Parent
{
	public void parent()
	{
		System.out.println("This is Parent Class..");
	}
}
class Child extends Parent
{
	public void Child()
	{
		System.out.println("This is Child Class..");
	}
}
public class Assignment23
{
	public static void main(String[] args) 
	{
		Parent obj1=new Parent();
		Child obj2=new Child();
		
		obj1.parent();
		obj2.Child();
		obj2.parent();
	}
}
