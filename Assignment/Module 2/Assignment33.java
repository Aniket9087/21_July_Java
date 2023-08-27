//	Create a class named 'Shape' with a method to print "This is this is shape". Then
//create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
//having a method to print "This is rectangular shape" and "This is circular shape"
//respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
//"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
//object of 'Square' class

package com.assignment;

class Shape1
{
	public void printshape()
	{
		System.out.println("This is a Shape..");
	}
}
class Rectangle1 extends Shape1
{
	public void printshape()
	{
		System.out.println("This is Rectangular Shape..");
	}
}
class Circle extends Shape1
{
	public void printshape()
	{
		System.out.println("This is Circular Shape..");
	}
}
class Square2 extends Shape1
{
	public void printshape()
	{
		System.out.println("Square is Rectangle..");
	}
}
public class Assignment33 
{
	public static void main(String[] args) 
	{
		Square2 s=new Square2();
		s.printshape();
		
		Shape1 v=new Shape1();
		v.printshape();
	}
}
