package com.example.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan_applications")
public class Rules {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="application_id")
	private int applicationId;
	
	private String userName;
	private Double amount;
	@Column(name="net_Worth")
	private Double netWorth;
	private Double revenue;
	private Double debt;
	private LocalDate submissionDate;
	
//	@Column(name="location",nullable=true,length=40)
//	private String location;
	
	private String experience;
	public int getApplicationId() {
		return applicationId;
	}
	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Double getNetWorth() {
		return netWorth;
	}
	public void setNetWorth(Double netWorth) {
		this.netWorth = netWorth;
	}
	public Double getRevenue() {
		return revenue;
	}
	public void setRevenue(Double revenue) {
		this.revenue = revenue;
	}
	public Double getDebt() {
		return debt;
	}
	public void setDebt(Double debt) {
		this.debt = debt;
	}
//	public String getLocation() {
//		return location;
//	}
//	public void setLocation(String location) {
//		this.location = location;
//	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public Rules() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LocalDate getSubmissionDate() {
		return submissionDate;
	}
	public void setSubmissionDate(LocalDate submissionDate) {
		this.submissionDate = submissionDate;
	}
	public Rules(int applicationId, String userName, Double amount, Double netWorth, Double revenue, Double debt,
			LocalDate submissionDate, String experience) {
		super();
		this.applicationId = applicationId;
		this.userName = userName;
		this.amount = amount;
		this.netWorth = netWorth;
		this.revenue = revenue;
		this.debt = debt;
		this.submissionDate = submissionDate;
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Rules [applicationId=" + applicationId + ", userName=" + userName + ", amount=" + amount + ", netWorth="
				+ netWorth + ", revenue=" + revenue + ", debt=" + debt + ", submissionDate=" + submissionDate
				+ ", experience=" + experience + "]";
	}
	public Rules(int applicationId, String userName, Double amount, Double netWorth, Double revenue, Double debt) {
		super();
		this.applicationId = applicationId;
		this.userName = userName;
		this.amount = amount;
		this.netWorth = netWorth;
		this.revenue = revenue;
		this.debt = debt;
	}
	


	
	
	
		
}
