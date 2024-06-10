package com.example.service;

import java.util.List;

import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;

import com.example.controller.FaController;
import com.example.model.Application;
import com.example.model.Fa;
import com.example.model.Rules;

@Component
public interface FaService {

	boolean submitForm(Rules rule);

	Application saveApplication(Application app);
	
	Fa login(String faUserName, String pass);

	List<Rules> fetchAllApplications();

	Rules getDetails(int id);

	boolean evaluate(Rules rule);

	Application setApplicationStatus(String string,int id);

	List<Application> fetchApplicationHistory();

	Fa createNewFa(Fa fa);

	Fa fetchUserDetails(String user);

}
