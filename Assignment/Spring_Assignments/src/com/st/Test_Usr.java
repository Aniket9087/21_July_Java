package com.st;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test_Usr 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		
		
		List<User> user=(List<User>) context.getBean("user");
		
		
		for(User users : user)
		{
			System.out.println(users.getId()+":"+users.getFname()+" "+users.getLname());
			
			System.out.println("Email : "+users.getEmail());
			System.out.println("Mobile : "+users.getMobile());
			System.out.println();
		}
	}
}
