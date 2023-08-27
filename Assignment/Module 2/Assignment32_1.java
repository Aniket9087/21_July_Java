// 	We have to calculate the area of a rectangle, a square and a circle. Create an abstract
//class 'Shape' with three abstract methods namely 'RectangleArea' taking two
//parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
//parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
//side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
//all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
//area of rectangle, square and circle respectively. Create an object of class 'Area' and
//call all the three methods. I3.

package com.assignment;

abstract class shape
{
	public abstract int RectangleArea(int length, int breadth);
	public abstract int SquareArea(int side);
	public abstract int CircleArea(int radius);
}
class Area extends shape
{

	@Override
	public int RectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		return length*breadth;
	}

	@Override
	public int SquareArea(int side) {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public int CircleArea(int radius) {
		// TODO Auto-generated method stub
		return (int) (3.14*radius*radius);
	}
}
public class Assignment32_1
{
	public static void main(String[] args)
	{
		Area a1=new Area();
		int RA = a1.RectangleArea(5, 10);
		System.out.println("Area of Rectangle: "+RA);
		
		int SA = a1.SquareArea(5);
		System.out.println("Area of Square: "+SA);
		
		int CA=a1.CircleArea(4);
		System.out.println("Area of Circle: "+CA);
	}
}
