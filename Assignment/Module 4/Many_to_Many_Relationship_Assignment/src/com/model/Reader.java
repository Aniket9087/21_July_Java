package com.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Reader")
public class Reader 
{
	private int readerid;
	private String 	email,firstname,lastname;
	Set<Subscriptions>subscription;
	
	@Id
	@GenericGenerator(name = "increment",strategy = "increment")
	@GeneratedValue(generator = "increment")
	public int getReaderid() {
		return readerid;
	}
	public void setReaderid(int readerid) {
		this.readerid = readerid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@ManyToMany
	@JoinTable(name = "read_sub",
				joinColumns = @JoinColumn(name="readerid"),
				inverseJoinColumns = @JoinColumn(name="subscriptionid"))
	public Set<Subscriptions> getSubscription() {
		return subscription;
	}
	public void setSubscription(Set<Subscriptions> subscription) {
		this.subscription = subscription;
	}
}
