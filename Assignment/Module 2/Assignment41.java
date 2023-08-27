//	W.A.J.P to create a class Student with attributes roll no, name, age and course.
//Initialize values through parameterized constructor. If age of student is not in
//between 15 and 21 then generate user defined exception
//"AgeNotWithinRangeException". If name contains numbers or special symbols
//raise exception "NameNotValidException". Define the two exception classes. 

package com.assignment;

class AgeNotwithinRangeException extends Exception
{
	public AgeNotwithinRangeException(String message)
	{
		super(message);
	}
}
class NameNotvalidexception extends Exception
{
	public NameNotvalidexception(String message)
	{
		super(message);
	}
}
class Student
{
	int rollno;
	String name;
	int age;
	String course;
	
	public Student(int rollno, String name, int age, String course) throws AgeNotwithinRangeException, NameNotvalidexception
	{
		if(age<15 || age>21)
		{
			throw new AgeNotwithinRangeException("Age is not within the range of 15 and 21.");
		}
		if(name.matches(".*\\d.*") || !name.matches("[a-zA-Z]+"))
		{
			throw new NameNotvalidexception("Name contains numbers or special symbols.");
		}
		
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		this.course=course;
	}
}
public class Assignment41 
{
	public static void main(String[] args)
	{
		try 
		{
			Student s=new Student(1, "Aniket", 20, "Java");
			System.out.println("Success");
		} catch (AgeNotwithinRangeException e) 
		{
			System.out.println(e.getMessage());
			// TODO: handle exception
		} catch (NameNotvalidexception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
