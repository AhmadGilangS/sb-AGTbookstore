package com.AGTbookstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user3")

public class User {
	
	private long id;
	private String fullname;
	private String email;
	private String pass;
	private String phone;
	private String address;
	private String roles;
	
	public User () {
		
	}
	
	public User(String email, String pass) {
		super();
		this.email = email;
		this.pass = pass;
	}

	public User(String fullname, String email, String pass, String phone, String address, String roles) {
		super();
		this.fullname = fullname;
		this.email = email;
		this.pass = pass;
		this.phone = phone;
		this.address = address;
		this.roles = roles;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "fullname", nullable = false)
	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	@Column(name = "email", nullable = false)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "pass", nullable = false)
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Column(name = "phone", nullable = false)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "address", nullable = false)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "roles", nullable = false)
	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
	
	
}