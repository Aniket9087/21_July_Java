package com.test;

import com.dao.Hbdao;
import com.model.Cart;
import com.model.Item;

public class test 
{
	public static void main(String[] args) 
	{
		Hbdao dao=new Hbdao();
		Cart c=new Cart();
		c.setName("Burger");
		c.setTotal(3);
		
		Item i=new Item();
		i.setItemid("1");
		i.setItemtotal(2);
		i.setQuantity(1);
	}
}
