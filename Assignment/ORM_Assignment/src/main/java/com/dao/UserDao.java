package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.model.usermodel;

public class UserDao 
{
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Transactional
	public void insert(usermodel user)
	{
		hibernateTemplate.saveOrUpdate(user);
	}
	
	public usermodel getLogin(int id)
	{
		return hibernateTemplate.get(usermodel.class, id);
	}	
	
	@Transactional
	public List<usermodel> getAllUser()
	{
		return hibernateTemplate.loadAll(usermodel.class);
	}
	
	@Transactional
	public void update(usermodel user)
	{
		hibernateTemplate.saveOrUpdate(user);
	}
	
	@Transactional
	public void delete(int id)
	{
		usermodel user=hibernateTemplate.get(usermodel.class, id);
		hibernateTemplate.delete(user);
	} 
}
