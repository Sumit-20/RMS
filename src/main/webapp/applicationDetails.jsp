<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html >
<head>
<meta charset="ISO-8859-1">
<title>ApplicationDetails </title>
<link rel = "stylesheet" type ="text/css" href="/webjars/bootstrap/css/bootstrap.min.css"/>
</head>
<body>
	<% response.setHeader("Cache-Control","no-cache,no-store,must-revalidate"); 
	if(session.getAttribute("loginId")==null)
      {
          response.sendRedirect("login");
      }
	%>
	<br></br>
	
<div class="container text-center">
<h3>Application Details</h3>
<br></br>
<table class="table table-striped table-bordered" class="table table-hover table-dark">
	<tr>
		<td>ApplicationId</td>
		<td><c:out value="${ru.applicationId}"></c:out></td>
	</tr>
	<tr>
		<td>Amount</td>
		<td><c:out value="${ru.amount}"></c:out></td>		
	</tr>
	<tr>
		<td>Debt</td>
		<td><c:out value="${ru.debt}"></c:out></td>		
	</tr>
	<tr>
		<td>Submission Date</td>
		<td><c:out value="${ru.submissionDate}"></c:out></td>		
	</tr>
	<tr>
		<td>Status</td>
		<td><c:out value="${status}"></c:out></td>		
	</tr>	  
</table>
<button type="button" class="btn btn-dark"><a  href="/status" role="button">OK</a></button>
</div>
</body>
</body>
</html>