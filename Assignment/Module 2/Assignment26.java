//	Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' without any parameter in its constructor.

package com.assignment;

class Triangle
{
	int side1;
	int side2;
	int side3;
	
	public Triangle() 
	{
		side1=3;
		side2=4;
		side3=5;
	}
	
	int perimeter()
	{
		return side1+side2+side3;
	}
	
	int area()
	{
		int s=perimeter()/2;
		return (s*(s-side1)*(s-side2)*(s-side3));
		
	}
}
public class Assignment26
{
	public static void main(String[] args)
	{
		Triangle t=new Triangle();
		int perimeter = t.perimeter();
		int square=t.area();
		
		System.out.println("Perimeter: "+perimeter);
		System.out.println("Area : "+square);
	}
}
