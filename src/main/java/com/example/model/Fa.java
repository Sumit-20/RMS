package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fa_Details")
public class Fa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="fa_id",nullable=false,unique=true)
	int faId;
	@Column(nullable=false,unique=true,length=250)
	String faUserName;
	@Column(nullable=false,unique=true,length=250)
	String password;
	@Column(nullable=false,length=250)
	String name;
	@Column(nullable=false,unique=true,length=250)
	String email;
	@Column(nullable=false)
	String role;
	public int getFaId() {
		return faId;
	}
	public void setFaId(int faId) {
		this.faId = faId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFaUserName() {
		return faUserName;
	}
	public void setFaUserName(String faUserName) {
		this.faUserName = faUserName;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Fa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Fa(int faId, String faUserName, String password, String name, String email, String role) {
		super();
		this.faId = faId;
		this.faUserName = faUserName;
		this.password = password;
		this.name = name;
		this.email = email;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Fa [faId=" + faId + ", faUserName=" + faUserName + ", password=" + password + ", name=" + name
				+ ", email=" + email + ", role=" + role + "]";
	}
	public Fa(String faUserName, String password, String name, String email, String role) {
		super();
		this.faUserName = faUserName;
		this.password = password;
		this.name = name;
		this.email = email;
		this.role = role;
	}
	public void coPassword()
	{
		this.password=Integer.toString(this.password.hashCode());
	}
	
}
