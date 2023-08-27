// 	Create a class to print the area of a square and a rectangle. The class has two methods
//with the same name but different number of parameters. The method for printing
//area of a rectangle has two parameters which are length and breadth respectively
//while the other method for printing area of square has one parameter which is side
//of square.

package com.assignment;

class AreaCalculator
{
	public void calculateArea(int side)
	{
		int area=side*side;
		System.out.println("The Area of the Square is.."+area);
	}
	
	public void calculateArea(int length, int breadth)
	{
		int area=length*breadth;
		System.out.println("The Area of Rectanngle is.."+area);
	}
}
public class Assignment22
{
	public static void main(String[] args) 
	{
		AreaCalculator a1=new AreaCalculator();
		a1.calculateArea(4);
		a1.calculateArea(2, 4);
	}
}
