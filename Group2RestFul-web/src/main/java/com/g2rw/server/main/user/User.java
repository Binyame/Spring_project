package com.g2rw.server.main.user;
import java.util.Date;

public class User {
	public User(Integer id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	
	private Integer id;  
	private String name;  
	private Date dob;  
	public Integer getId() 
	{
		return id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}

}
