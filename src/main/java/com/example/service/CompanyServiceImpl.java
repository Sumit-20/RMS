package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.model.Application;
import com.example.model.Company;
import com.example.model.Rules;
import com.example.repository.ApplicationRepository;
import com.example.repository.CompanyRepository;
import com.example.repository.RulesRepository;

@Service
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyRepository cr;
	
	@Autowired
	private RulesRepository rr;
	
	@Autowired
	private ApplicationRepository ar;

	public Company registerCompany(Company com) {
		cr.save(com);
		return com;
	}

	public Company login(String userName, String pass) {
		Company con= cr.findByUserNameAndPassword(userName,pass);
		return con;
	}

	public List<Application> applicationStatus(String userName) {
		List<Application> ap=ar.getByUserName(userName);
		return ap;
	}

	
	public Rules applicationDetails(int id) {
		// TODO Auto-generated method stub
		Rules ru=rr.getByApplicationId(id);
		return ru;
	}

	
	public String getStatus(int id) {
		// TODO Auto-generated method stub
		Application ap1=ar.getByApplicationId(id);
		String status=ap1.getStatus();
		return status;
	}

	
	public Company fetchUserDetails(String user) {
		// TODO Auto-generated method stub
		Company com=cr.findByUserName(user);
		return com;
	}


}
