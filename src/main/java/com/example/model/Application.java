package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ApplicationDetails")
public class Application {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sNo;
	private int applicationId;
	private String userName;
	private String status;
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Application() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Application [sNo=" + sNo + ", applicationId=" + applicationId + ", userName=" + userName + ", status="
				+ status + "]";
	}
	public Application(int sNo, int applicationId, String userName, String status) {
		super();
		this.sNo = sNo;
		this.applicationId = applicationId;
		this.userName = userName;
		this.status = status;
	}
	public Application(String status) {
		super();
		this.status = status;
	}
}
