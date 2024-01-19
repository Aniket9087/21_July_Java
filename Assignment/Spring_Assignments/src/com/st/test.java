package com.st;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("Bean.xml");
		Student st=(Student)context.getBean("stud");
		System.out.println(st);
	}
}
