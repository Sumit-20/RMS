package com.example.service;

import java.util.List;
import org.springframework.stereotype.Component;

import com.example.model.*;

@Component
public interface CompanyService {
	
	public Company registerCompany(Company com);

	public Company login(String userName, String pass);

	public List<Application> applicationStatus(String loginUserName);

	public Rules applicationDetails(int id);

	public String getStatus(int id);

	public Company fetchUserDetails(String user);

}
