package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.model.usermodel;

public class AdminDao 
{
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public List<usermodel> getAllUser()
	{
		return hibernateTemplate.loadAll(usermodel.class);
	}
	
	@Transactional
	public void deleteUser(int id)
	{
		usermodel user=hibernateTemplate.get(usermodel.class, id);
		hibernateTemplate.delete(user);
	}
}
