//	W.A.J. P to create one thread by implementing Runnable interface in Class.

package com.assignment;

class First implements Runnable
{

	@Override
	public void run() 
	{
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My First Thread Is..."+i);
		}
		System.out.println("My First Thread is Completed...");		

	}

}
public class Assignment42 
{
	public static void main(String[] args)
	{
		First f1=new First();
		Thread t1=new Thread();
		t1.start();
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("My Main Thread Is..."+i);
		}
		System.out.println("My Main Thread is Completed...");		


	}
	
}
