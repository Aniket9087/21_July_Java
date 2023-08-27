//	W.A.J.P to create 2 threads and execute that threads by providing sleep time as 2000ms and check the execution.

package com.assignment;

class second extends Thread
{
	public void run()
	{
		try 
		{
			java.lang.Thread.sleep(2000);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println("This is Thread");
	}
}
public class Assignment44
{
	public static void main(String[] args) 
	{
		Thread t=new Thread();
		t.run();
	}
}
