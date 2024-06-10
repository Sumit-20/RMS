<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<!doctype html>
<html lang="en">
  <head>
  	<title>Company_index</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel = "stylesheet" type ="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>

    <link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
		<link rel="stylesheet" href="css1/style.css">
		
  </head>
  <body>
  <section>
   <% response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); 
	if(session.getAttribute("loginId")==null)
      {
          response.sendRedirect("login");
      }
	%>
		
		<div class="wrapper d-flex align-items-stretch">
			<nav id="sidebar">
				<div class="p-4 pt-5">
		  		<a href="#" class="img logo rounded-circle mb-5" style="background-image: url(images/logo1.png); " ></a>
		  		<div class="container text-center" class="caption"><c:out value="${company.userName}"></c:out></div>
		  		<div class="container text-center" class="caption"></div>
		  		<br></br>
	        <ul class="list-unstyled components mb-5">
	          <li>
	              <a class="nav-link" href="/welcome">Home</a>
	          </li>
	          
	          <li>
	              <a class="nav-link" href="/form">Applications Form</a>
	          </li>
	          <li class="nav-item">
	          <a class="nav-link" href="/status">Status</a>
	          </li>
	          
	        </ul>

	        <div class="footer">
	        	<p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
						  Copyright &copy;<script>document.write(new Date().getFullYear());</script> Risk Management System
						  <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
	        </div>

	      </div>
    	</nav>

        <!-- Page Content  -->
      <div id="content" class="p-4 p-md-5">

        <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <div class="container-fluid">

            <button type="button" id="sidebarCollapse" class="btn btn-primary">
              <i class="fa fa-bars"></i>
              <span class="sr-only">Toggle Menu</span>
            </button>
            <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <i class="fa fa-bars"></i>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent" >
              <ul class="nav navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/logout">Logout</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#about">About</a>
                </li>
                
                <li class="nav-item">
                    <a class="nav-link" href="#contact">Contact</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>

        <h2 class="mb-4">Welcome <c:out value="${company.userName}"></c:out></h2>
        <!-- change start -->
        <div>
          <table class="table table-borderless">
            <tr>
              <td>Company Name :</td>
              <td><c:out value="${company.companyName}"></c:out></td>
            </tr>
            <tr>
              <td>Email Id :</td>
              <td><c:out value="${company.email}"></c:out></td>		
            </tr>
            <tr>
              <td>Address :</td>
              <td><c:out value="${company.address}"></c:out></td>		
            </tr>
            <tr>
              <td>User Name :</td>
              <td><c:out value="${company.userName}"></c:out></td>		
            </tr>	  
          </table>
        </div>
        <br>
        <p>You can fill an application form through Application Form tab and check the status of all of your applications through status tab. </p>
        <!-- change end -->
      </div>
		</div>
		</section>
		
		<section id="about">
		<div class="container">
		<div id="content" class="p-4 p-md-5">
		<div class="container text-center"> <h2 class="mb-4">About Us</h2>
       <p align="justify">We are providing personal finance digital platform for users to make personal financial decision transparent and easy as possible. we are providing flexible and convenient personal finance deal to our customers through our various finance partners and banks. We have easy application process , instant approval excellent support and security .</p>
        <p align="justify"> RMS(risk management system) is a web application which will be used by multiple users like financial analysts who would like to 
evaluate an application, end users who want to apply for credit. The system should have capability to Submit an application (end user will do this),Run automated policies to decide whether to approve the credit or reject it(You have come up with a set 
of policies which get triggered on every submitted application to decide whether to approve or decline, and get a quick status of your applied application either approved or reject with in your profile.

                         </p>
                         <p align="justify">Loan approval is easier & quicker with the right set of documents. The process requires minimal document set & could marginally vary from lender to lender depending on your personal loan requirements.</p>
      </div>
		
		
		</div>
		</div>
		</section>
		
		<section>
		<footer id="contact">
		<div class="container">
		<div class="row">

               <div class="col-md-5 col-sm-6">
                    <h2>Contact Us</h2>
                    <p>321, Vijay Nagar<br>Pin: 452010 <br>Indore (M.P.)</p>
                    
                    
               </div>

               <div class="col-md-4 col-sm-6">
                    <div class="footer-info">
                    	<h2>Keep in touch</h2>
                         <p><a href="tel:+91 8120667080">+91 9783787777</a></p>
                         <p><a href="mailto:yadavji@company.com">info@rms.com</a></p>
                         <p><a href="https://www.google.co.in/maps/place/Vijay+Nagar,+Indore,+Madhya+Pradesh+452010/@22.7529441,75.8915147,17z/data=!3m1!4b1!4m5!3m4!1s0x396302af403406fb:0x5b50834b117f8bab!8m2!3d22.7532848!4d75.8936962">Our Location</a></p>
                    </div>
               </div>

              

          </div>
		</div>
		</footer>
		</section>
		

    <script src="js1/jquery.min.js"></script>
    <script src="js1/popper.js"></script>
    <script src="js1/bootstrap.min.js"></script>
    <script src="js1/main.js"></script>
  </body>
</html>