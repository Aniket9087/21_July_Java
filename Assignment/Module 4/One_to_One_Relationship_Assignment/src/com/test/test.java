package com.test;

import com.dao.HbDao;
import com.model.Address;
import com.model.Student;

public class test 
{
	public static void main(String[] args) 
	{
		HbDao dao=new HbDao();
		Address ad=new Address();
		ad.setStreet("Street line");
		ad.setCity("Bhavnagar");
		ad.setState("Gujarat");
		ad.setZipcode("12345");
		dao.addadress(ad);
		
		Student s=new Student();
		s.setStudentname("Aniket");
		s.setAddress("Bhavnagar");
		s.setAd(ad);
		dao.addstudent(s);
	}
}
