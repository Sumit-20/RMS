package com.example.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Application;
import com.example.model.Fa;
import com.example.model.Rules;
import com.example.repository.ApplicationRepository;
import com.example.repository.FaRepository;
import com.example.repository.RulesEngineRepository;
import com.example.repository.RulesRepository;

@Service
public class FaServiceImpl implements FaService{
	
	@Autowired
	private FaRepository fr;
	
	@Autowired
	private RulesRepository rr;
	
	@Autowired
	private ApplicationRepository ar;
	
	@Autowired
	private RulesEngineRepository rer;

	public boolean submitForm(Rules rule) {
		List<String> li=ar.checkHistory(rule.getUserName());
//      JAVA 8 STREAM API
		boolean b=li.stream().anyMatch(s -> s.contains("pending"));
        if(!b)
        {
        	rr.save(rule);
        	return true;
        }
        else
        {
        	return false;
        }
	}

	
	public Application saveApplication(Application app) {
		Application application=ar.save(app);
		return application;
	}

	public Fa login(String faUserName, String pass) {
		Fa con= fr.findByfaUserNameAndPassword(faUserName,pass);
		return con;
	}

	public List<Rules> fetchAllApplications() {
		List<Rules> ru=rr.getApplications();
		return ru;
	}

	public Rules getDetails(int id) {
		Rules rule=rr.getByApplicationId(id);
		return rule;
	}

	public boolean evaluate(Rules rule) {
		LocalDate p=java.time.LocalDate.now();
		int currentMonth=p.getMonthValue();
		int currentYear=p.getYear();
		String date=rule.getExperience();
		String estabMonth="";
		String estabYear="";
		for(int i=0;i<date.length();i++)
		{
			if(i<=3)
			{
				estabYear+=date.charAt(i);
			}
			else if(i>=5)
			{
				estabMonth+=date.charAt(i);
			}
		}
		int establishmentYear=Integer.parseInt(estabYear);
		int establishmentMonth=Integer.parseInt(estabMonth);
		int diff=currentYear-establishmentYear;
		int yearToMonth=12*diff;
		int totalMonths=yearToMonth-establishmentMonth;
		Double amount=rule.getAmount();
		Double debt=rule.getDebt();
		Double netWorth=rule.getNetWorth();
		Double revenue=rule.getRevenue();
		Double maxAmount=rer.maxAmount();
		Double minAmount=rer.minAmount();
		Double maxDebt=rer.maxDebt();
		Double minExperience=rer.minExperience();
		Double minRevenue=rer.minRevenue();
		Double minNetWorth=rer.minNetWorth();
		if(amount>=minAmount && amount<=maxAmount && debt<=maxDebt && totalMonths>=minExperience && netWorth>=minNetWorth && revenue>=minRevenue)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public Application setApplicationStatus(String string, int id) {
		Application ap1=ar.getByApplicationId(id);
		ap1.setStatus(string);
		Application ap=ar.save(ap1);
		return ap;
	}

	public List<Application> fetchApplicationHistory() {
		
			List<Application> ap=ar.getApplicationHistory();
			return ap;
		}


	
	public Fa createNewFa(Fa fa) {
		// TODO Auto-generated method stub
		Fa obj=fr.save(fa);
		return obj;
	}


	
	public Fa fetchUserDetails(String user) {
		// TODO Auto-generated method stub
		Fa fa=fr.findByfaUserName(user);
		return fa;
	}

	}

	
	

