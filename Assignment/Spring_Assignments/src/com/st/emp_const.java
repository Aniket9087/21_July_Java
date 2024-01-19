package com.st;

public class emp_const 
{
	int eid;
	String name;
	
	public emp_const()
	{
		eid=1;
		name="Aniket";
	}
	
	public emp_const(int eid,String name)
	{
		this.eid=eid;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println("Eid is..."+eid);
		System.out.println("Name is..."+name);
	}
}
