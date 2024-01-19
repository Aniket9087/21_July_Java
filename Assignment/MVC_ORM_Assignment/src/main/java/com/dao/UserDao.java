package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.model.User;

public class UserDao 
{
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Transactional
	public void insert(User user) {
		hibernateTemplate.saveOrUpdate(user);
	}

	@Transactional
	public List<User> getAllUser() {
		return hibernateTemplate.loadAll(User.class);
	}

	@Transactional
	public User getUser(int id) {
		return hibernateTemplate.get(User.class, id);
	}

	@Transactional
	public void update(User user) {
		hibernateTemplate.saveOrUpdate(user);
	}

	@Transactional
	public void delete(int id) {
		User user = hibernateTemplate.get(User.class, id);
		hibernateTemplate.delete(user);
	}
}
