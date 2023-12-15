package com.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Subscriptions")
public class Subscriptions 
{
	private int subscriptionid;	
	private String subscriptionname;
	Set<Reader> readers;
	@Id
	@GenericGenerator(name = "increment",strategy = "increment")
	@GeneratedValue(generator = "increment")
	public int getSubscriptionid() {
		return subscriptionid;
	}
	public void setSubscriptionid(int subscriptionid) {
		this.subscriptionid = subscriptionid;
	}
	public String getSubscriptionname() {
		return subscriptionname;
	}
	public void setSubscriptionname(String subscriptionname) {
		this.subscriptionname = subscriptionname;
	}
	@ManyToMany(mappedBy = "subscription")
	public Set<Reader> getReaders() {
		return readers;
	}
	public void setReaders(Set<Reader> readers) {
		this.readers = readers;
	}
	
}
