package com.st;

public class Inner_Ob 
{
	private Milk milk;
	
	public void show()
	{
		System.out.println("Showing"+milk.getName()+" ");
	}
	
	public void setMilk(Milk milk)
	{
		System.out.println("Milk into glass"+milk.getName());
		this.milk=milk;
	}
}
