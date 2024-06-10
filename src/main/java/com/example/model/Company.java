package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="companyDetails")
public class Company {
	
	public Company(String role) {
		super();
		this.role = role;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="company_id",length=250)
	private int companyId;
	
	@Column(nullable=false,unique=true,length=250)
	private String userName;
	
	@Column(nullable=false,length=250)
	private String password;
	
	@Column(name="company_name",nullable=false,unique=true,length=250)
	private String companyName;
	
	@Column(nullable=false,length=250)
	private String address;
	
	@Column(nullable=false,unique=true,length=250)
	private String email;
	
	@Column(nullable=false)
	private String role;
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void coPassword()
	{
		this.password=Integer.toString(this.password.hashCode());
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Company(int companyId, String userName, String password, String companyName, String address, String email,
			String role) {
		super();
		this.companyId = companyId;
		this.userName = userName;
		this.password = password;
		this.companyName = companyName;
		this.address = address;
		this.email = email;
		this.role = role;
	}
	public Company(String userName, String password, String companyName, String address, String email, String role) {
		super();
		this.userName = userName;
		this.password = password;
		this.companyName = companyName;
		this.address = address;
		this.email = email;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", userName=" + userName + ", password=" + password
				+ ", companyName=" + companyName + ", address=" + address + ", email=" + email + ", role=" + role + "]";
	}
	
	
	
}
