// 	We have to calculate the percentage of marks obtained in three subjects (each out of
//100) by student A and in four subjects (each out of 100) by student B. Create an
//abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
//other classes 'A' and 'B' each having a method with the same name which returns the
//percentage of the students. The constructor of student A takes the marks in three
//subjects as its parameters and the marks in four subjects as its parameters for student
//B. Create an object for each of the two classes and print the percentage of marks for
//both the students.

package com.assignment;

abstract class Marks
{
	abstract float getpercentage();
}
class A extends Marks
{
	float subject1;
	float subject2;
	float subject3;
	
	A(float subject1,float subject2,float subject3)
	{
		this.subject1=subject1;
		this.subject2=subject2;
		this.subject3=subject3;
	}
	
	float getpercentage()
	{
		float totalmarks=subject1+subject2+subject3;
		return (totalmarks/300)*100;
	}
}
class B extends Marks
{
	float subject1;
	float subject2;
	float subject3;
	float subject4;
	
	B(float subject1,float subject2,float subject3,float subject4)
	{
		this.subject1=subject1;
		this.subject2=subject2;
		this.subject3=subject3;
		this.subject4=subject4;
	}
	
	float getpercentage()
	{
		float totalmarks=subject1+subject2+subject3+subject4;
		return (totalmarks/400)*100;
	}
}
public class Assignment30
{
	public static void main(String[] args)
	{
		A a1=new A(80,85,90);
		B b1=new B(75,80,85,90);
		
		float PA=a1.getpercentage();
		float PB=b1.getpercentage();
		
		System.out.println("Percentage of marks of A:"+PA+"%");
		System.out.println("Percentage of marks of B:"+PB+"%");
	}
}
