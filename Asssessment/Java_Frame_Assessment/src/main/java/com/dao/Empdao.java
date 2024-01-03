package com.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.model.Employee;

public class Empdao 
{
	HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	
	@Transactional
	public void insert(Employee e)
	{
		hibernateTemplate.save(e);
	}
	
	@Transactional
	public void update(Employee e)
	{
		hibernateTemplate.update(e);
	}
	
	
	@Transactional
	public void delete(int id)
	{
		hibernateTemplate.delete(getById(id));
	}
	
	public Employee getById(int id)
	{
		return hibernateTemplate.get(Employee.class, id);
	}
	
	
	public List<Employee> getAll()
	{
		return hibernateTemplate.loadAll(Employee.class);
	}
}
