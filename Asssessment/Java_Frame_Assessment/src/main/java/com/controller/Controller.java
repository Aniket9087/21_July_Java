package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dao.Empdao;
import com.model.Employee;

@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	Empdao dao;
	
	@RequestMapping("/empForm")
	public String empform()
	{
		return "empForm";
	}
	
	@RequestMapping("/viewemp")
	public String viewemp(Model m)
	{
		List<Employee> emp=dao.getAll();
		m.addAttribute("emp", emp);
		return "viewAllEmp";
	}
	
	
	@RequestMapping(value = "/save",method = RequestMethod.POST)
	public String save(@ModelAttribute("employee") Employee employee)
	{
		dao.insert(employee);
		return "redirect:/viewemp";
	}
	
	@RequestMapping(value = "/edit/{id}")
	public String editform(@PathVariable int id,Model m)
	{
		Employee e=dao.getById(id);
		m.addAttribute("e", e);
		return "editForm";
	}
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	public String update(@ModelAttribute("employee") Employee employee)
	{
		dao.update(employee);
		return "redirect:/viewemp";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		dao.delete(id);
		return "redirect:/viewemp";
	}
	
	
}
