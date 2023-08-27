//	Create a class named 'Member' having the following members:
//1. Data members
//2. Name
//3. Age
//4. Phone number
//5. Address
//6. Salary
//It also has a method named 'printSalary' which prints the salary of the members

package com.assignment;


class Member
{
	String name;
	int age;
	String phone_number;
	String address;
	double salary;
	
	public void salary()
	{
		System.out.println("Salary is.."+salary);
	}
}
public class Assignment24
{
	public static void main(String[] args)
	{
		Member m1=new Member();
		m1.name="Aniket";
		m1.age=21;
		m1.phone_number="9316159616";
		m1.address="Bhavnagar";
		m1.salary=10000;
		m1.salary();
		
	}
}
