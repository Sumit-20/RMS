<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html >
<head>
<meta charset="ISO-8859-1">
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>loanApplication </title>
<link rel = "stylesheet" type ="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>
<link href="https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900" rel="stylesheet">
		
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
		<link rel="stylesheet" href="css1/style.css">
</head>

<body>
	<% response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); 
	if(session.getAttribute("loginId")==null)
      {
          response.sendRedirect("login");
      }
	%>
	
	<div>
	        <nav class="navbar navbar-expand-lg navbar-light bg-light">
          <div class="container-fluid">

            
            <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <i class="fa fa-bars"></i>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent" >
              <ul class="nav navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="/welcome">DashBoard</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/status">Status</a>
                </li>
                
                <li class="nav-item">
                    <a class="nav-link" href="/logout">Logout</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
        </div>


	<div class="container text-center">
	<legend><h3><b>Loan Application Form</b></h3></legend>
    <c:if test="${not empty Form }">
	   <h4>
	     <c:out value="${Form}">
	     </c:out>
	   </h4>
	</c:if>
	<br></br>
	
	<div class="container" style="border-color:gray;border:3px;border-style:solid; padding:1em;">
	
	<form:form action="submitform" method="post" modelAttribute="appForm"
style="max-width: 500px; margin: auto;"
class="well form-horizontal"
>

<div class="m-3">
<div class="form-group row">
<label class="col-form-label col-4">LoanAmount </label>
<div class="col-8">
<form:input path="amount" type="number" step="100" placeholder="enter amount" required="required" minlength="4" maxlength="6"/>
</div>
</div>

<div class="form-group row">
<label class="col-form-label col-4">CompanyNetworth </label>
<div class="col-8">
<form:input path="netWorth"  type="number" step="100" placeholder="enter netWorth" required="required" minlength="4" maxlength="15"/>
</div>
</div>

<div class="form-group row">
<label class="col-form-label col-4">CompanyRevenue </label>
<div class="col-8">
<form:input path="revenue" type="number" step="100"  placeholder="enter revenue" required="required" minlength="4" maxlength="10"/>
</div>
</div>


<div class="form-group row">
<label class="col-form-label col-4">Debt </label>
<div class="col-8">
<form:input path="debt" type="number" step="50" placeholder="enter debt" required="required" minlength="1" maxlength="7"/>
</div>
</div>

<!-- <div class="form-group row"> -->
<!-- <label class="col-form-label col-4">CompanyLocation : </label> -->
<!-- <div class="col-8"> -->
<%--  <form:input path="location" type="text" placeholder="enter location" required="required" minlength="2" maxlength="15"/> --%>
<!-- </div> -->
<!-- </div> -->

<div class="form-group row">
<label class="col-form-label col-4">FoundationYear  </label>
<div class="col-8">
 <form:input path="experience" type="month"  required="required" minlength="1" maxlength="2"/>
</div>
</div>

<div>
<button type="submit" class="btn btn-primary">Submit</button>
</div>

</div>
</form:form>
</div>
</div>

<script src="js1/jquery.min.js"></script>
    <script src="js1/popper.js"></script>
    <script src="js1/bootstrap.min.js"></script>
    <script src="js1/main.js"></script>

</body>
</html>