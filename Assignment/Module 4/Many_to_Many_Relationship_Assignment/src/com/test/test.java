package com.test;

import java.util.HashSet;
import java.util.Set;

import com.dao.HbDao;
import com.model.Reader;
import com.model.Subscriptions;

public class test 
{
	public static void main(String[] args) 
	{
		HbDao dao=new HbDao();
		Set<Subscriptions>subscription=new HashSet<Subscriptions>();
		Subscriptions sb=new Subscriptions();
		sb.setSubscriptionname("Hotstar");
		dao.addSubsription(sb);
		
		
		Reader r=new Reader();
		r.setEmail("aniketparmar@gmail.com");
		r.setFirstname("Aniket");
		r.setLastname("Parmar");
		dao.addReader(r);
	}
}
