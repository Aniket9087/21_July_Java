package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Item")
public class Item 
{
	private int id,quantity;
	private String itemid;
	private double itemtotal;
	
	Cart ca;
	
	@Id
	@GenericGenerator(name = "increment",strategy = "increment")
	@GeneratedValue(generator = "increment")
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getItemid() {
		return itemid;
	}

	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public double getItemtotal() {
		return itemtotal;
	}

	public void setItemtotal(double itemtotal) {
		this.itemtotal = itemtotal;
	}
	
	@ManyToOne
	@JoinColumn(name = "cartid")

	public Cart getCa() {
		return ca;
	}

	public void setCa(Cart ca) {
		this.ca = ca;
	}
	
	
}
