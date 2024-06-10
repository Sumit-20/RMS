package com.example.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="rule_engine")
public class RuleEngine {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sNo;
	private String conditions;
	private String parameters;
	private Integer limits;
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getConditions() {
		return conditions;
	}
	public void setConditions(String conditions) {
		this.conditions = conditions;
	}
	public String getParameters() {
		return parameters;
	}
	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	public Integer getLimits() {
		return limits;
	}
	public void setLimits(Integer limits) {
		this.limits = limits;
	}
	@Override
	public String toString() {
		return "RuleEngine [sNo=" + sNo + ", conditions=" + conditions + ", parameters=" + parameters + ", limits="
				+ limits + "]";
	}
	public RuleEngine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RuleEngine(int sNo, String conditions, String parameters, Integer limits) {
		super();
		this.sNo = sNo;
		this.conditions = conditions;
		this.parameters = parameters;
		this.limits = limits;
	}
	
	

}
