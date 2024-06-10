<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>submit</title>
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
                    <a class="nav-link" href="/logout">Logout</a>
                </li>
              </ul>
            </div>
          </div>
        </nav>
        </div>
	
<br></br>
    <div class="container text-center">
      <h2><c:out value="${Form}"></c:out></h2>
      <button type="button" class="btn btn-dark"><a href="/form">OK</a></button>
    </div>
    
    <script src="js1/jquery.min.js"></script>
    <script src="js1/popper.js"></script>
    <script src="js1/bootstrap.min.js"></script>
    <script src="js1/main.js"></script>
</body>
</html>