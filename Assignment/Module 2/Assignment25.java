//Create a class named 'Rectangle' with two data members 'length' and 'breadth' and
//two methods to print the area and perimeter of the rectangle respectively. Its
//constructor having parameters for length and breadth is used to initialize the length
//and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its
//constructor having a parameter for its side (suppose s) calling the constructor of its
//parent class as 'super (s, s)'. Print the area and perimeter of a rectangle and a square

package com.assignment;

class Rectangle
{
	int length;
	int breadth;
	
	public Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	
	public int Area()
	{
		return length*breadth;
	}
	
	public int perimeter()
	{
		return 2*(length+breadth);
		
	}
}
class Square extends Rectangle
{

	public Square(int side)
	{
		super(side,side);
		// TODO Auto-generated constructor stub
	}
	
}
public class Assignment25
{
	public static void main(String[] args) 
	{
		Rectangle r=new Rectangle(4, 5);
		System.out.println("Rectangle Area: "+r.Area());
		System.out.println("Rectangle Perimeter: "+r.perimeter());
		
		Square s=new Square(3);
		System.out.println("Square Area: "+s.Area());
		System.out.println("Square Perimeter: "+s.perimeter());
	}
}
