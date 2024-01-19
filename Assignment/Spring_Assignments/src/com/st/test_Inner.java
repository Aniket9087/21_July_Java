package com.st;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_Inner 
{
	public static void main(String[] args) 
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("Bean.xml");
		Inner_Ob i=(Inner_Ob) context.getBean("i");
		
		i.show();
	}
}
