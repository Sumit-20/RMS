package com.example.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Application;
import com.example.model.Company;
import com.example.model.Fa;
import com.example.model.Rules;
import com.example.service.CompanyService;
import com.example.service.FaService;

@Controller
public class CompanyController {
	
	
	@Autowired
	private CompanyService cs;
	
	@Autowired
	private FaService fs;
	
	@GetMapping("/index")
	public String indexPage(Model model)
	{
		Company com=new Company();
		model.addAttribute("companyObj", com);
		
		return "index";
	}
		
	@GetMapping("/home")
	public String returnPage(Model model)
	{
		Company com=new Company();
		model.addAttribute("companyObj", com);
		
		return "companyProfile";
	}
	
	@GetMapping("/fahome")
	public String returnPage1(Model model)
	{
		Company com=new Company();
		model.addAttribute("companyObj", com);
		
		return "faProfile";
	}
	
	//Company ka signup
	@PostMapping("/signUpwelcome")
	public String welcomePage(@ModelAttribute("companyObj") Company comp,Model m)
	{	
		try
		{
			m.addAttribute("compan",comp);
			comp.setRole("company");
			comp.coPassword();
			Company com=cs.registerCompany(comp);
			return "redirect:login"; //change kiya h
		}
		catch(Exception e)
		{
			m.addAttribute("wrong","Failed to sign in!..try again");
			return "index";
		}
	}
	@GetMapping("/login")
	public String loginPage(Model m)
	{
		Company com=new Company();
		m.addAttribute("companyObj", com);
		return "login";
	}
	
	//for login
	@PostMapping("/welcome")
	public String welcomePage(@RequestParam("userName") String userName,@RequestParam("password") String pass,@RequestParam("role") String role,Model m,HttpServletRequest request,HttpSession session)
	{
		session=request.getSession();
		session.setAttribute("loginId",userName);
		session.setAttribute("Role",role);
		pass=Integer.toString(pass.hashCode());
		if(role.equals("company"))
		{
			try
			{
				Company com=cs.login(userName,pass);
				m.addAttribute("company", com);
				if(Objects.isNull(com)) { throw new Exception();}				
				return "companyProfile";
			}
			catch(Exception e)
			{
				m.addAttribute("wrong","wrong Id or password");
				return "loginfail";
			}
		}
		else
		{
			try 
			{
				Fa finan=fs.login(userName,pass);
				if(Objects.isNull(finan)) { throw new Exception();}
				m.addAttribute("fa", finan);
				return "faProfile";
			}
			catch(Exception e)
			{
				m.addAttribute("wrong","wrong Id or password");
				return "loginfail";
			}
		}		
	}
	
	@GetMapping("/welcome")
	public String tryMeth(Model m,HttpSession session)
	{
		String user=(String)session.getAttribute("loginId");
		String role=(String)session.getAttribute("Role");
		if(role.equals("company"))
		{
			Company com=cs.fetchUserDetails(user);
			m.addAttribute("company", com);
			return "companyProfile";
		}
		else
		{
			Fa fa=fs.fetchUserDetails(user);
			System.out.println(fa);
			m.addAttribute("fa",fa);
		    return "faProfile";
		}
	}
	
	//Blank Application form 
	@GetMapping("/form")
	public String viewApplicationForm(Model model)
	{
		Rules rule=new Rules();
		model.addAttribute("appForm", rule);
		return "applicationForm";
	}
	
	//submit application form
	@PostMapping("/submitform")
	public String submitApplicationForm(@ModelAttribute("appForm") Rules rule,Model m,HttpSession session)
	{
	   String user=(String) session.getAttribute("loginId");
	   rule.setUserName(user);
	   LocalDate p=java.time.LocalDate.now();
	   rule.setSubmissionDate(p);
	   boolean b=fs.submitForm(rule);
	   if(b)
	   {
		   Application app=new Application("pending");
		   app.setUserName(user);
		   app.setApplicationId(rule.getApplicationId());
		   Application a=fs.saveApplication(app);
		   m.addAttribute("Form","application submitted");
	   }
	   else
	   {
		   m.addAttribute("Form","your previous application is still pending");
	   }
	   return "afterSubmit";
	}
	
	//to view all applications 
	@GetMapping("/view")
	public String viewAllApplications(Model m)
	{
		List<Rules> ru=fs.fetchAllApplications();
		m.addAttribute("appliList", ru);
		return "viewApplications";
	}
	
	//to view status of Applications
	
	@GetMapping("/status")
	public String viewApplicationStatus(Model m,HttpSession session)
	{
		String user=(String) session.getAttribute("loginId");
		
		List<Application> ap=cs.applicationStatus(user);
		m.addAttribute("status", ap);
		return "viewStatus";
	}
	
	@GetMapping("/applicationDetail")
	public String viewApplicationDetails(Model m,@RequestParam("id") int id)
	{
		Rules ru =cs.applicationDetails(id);
		String status=cs.getStatus(id);
		m.addAttribute("status", status);
		m.addAttribute("ru", ru);
		return "applicationDetails";
	}
	
	@GetMapping("/evaluate")
	public String EvaluateApplication(Model m,@RequestParam("eval") int id )
	{
	   Rules rule=fs.getDetails(id);
	   boolean b=fs.evaluate(rule);
	   List<Rules> ru=fs.fetchAllApplications();
	   m.addAttribute("appliList", ru);
	   m.addAttribute("appId",id );
	   if(b)
	   {
     	   m.addAttribute("buttonView","approved");
     	   Application ap=fs.setApplicationStatus("approved",id);   
	   }
	   else
	   {
		   m.addAttribute("buttonView","rejected" );
		   Application ap=fs.setApplicationStatus("rejected",id);
	   }
	   List<Rules> ru1=fs.fetchAllApplications();
	   m.addAttribute("appliList", ru1);
	   return "viewApplications";
	}
	@GetMapping("/history")
	public String ApplicationHistory(Model m)
	{
		List<Application> ru=fs.fetchApplicationHistory();
		m.addAttribute("appliList", ru);
		return "applicationHistory";
	}
	@GetMapping("/logout")
	public String logout(Model m,HttpServletRequest request,HttpSession session)
	{
		session.removeAttribute("loginId");
		return "redirect:login";
	}
	@GetMapping("/addfa")
	public String signUpNewFa(Model model)
	{
		Fa finan=new Fa();
		model.addAttribute("faObj", finan);
		return "addFa";
	}
	
	//add new fa
	@PostMapping("/addfadone")
	public String addNewFa(@ModelAttribute("faObj") Fa fa,Model m)
	{	
		try
		{
			m.addAttribute("finAnalyst",fa);
			fa.setRole("fa");
			m.addAttribute("wrong","signed up succesfully");
			fa.coPassword();
			Fa obj=fs.createNewFa(fa);
		}
		catch(Exception e)
		{
			m.addAttribute("wrong","Failed to sign in!..try again");
		}
		return "afterFaSignUp";
	}
}
