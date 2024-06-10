<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>

<title>Risk Management System</title>

<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<meta name="description" content="">
<meta name="keywords" content="">
<meta name="author" content="">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/font-awesome.min.css">
<link rel="stylesheet" href="css/magnific-popup.css">

<link rel="stylesheet" href="css/owl.theme.css">
<link rel="stylesheet" href="css/owl.carousel.css">

<!-- MAIN CSS -->
<link rel="stylesheet" href="css/tooplate-style.css">

</head>
<body>

<!-- PRE LOADER -->
<div class="preloader">
     <div class="spinner">
          <span class="sk-inner-circle"></span>
     </div>
</div>


<!-- MENU -->
<div class="navbar custom-navbar navbar-fixed-top" role="navigation">
     <div class="container">

          <!-- NAVBAR HEADER -->
          <div class="navbar-header">
               <button class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="icon icon-bar"></span>
                    <span class="icon icon-bar"></span>
                    <span class="icon icon-bar"></span>
               </button>
               <!-- lOGO -->
          </div>

          <!-- MENU LINKS -->
          <div class="collapse navbar-collapse">
               <ul class="nav navbar-nav navbar-right">
                    <li><a href="#home" class="smoothScroll">Home</a></li>
                    <li><a href="#about" class="smoothScroll">About Us </a></li>
                    <li><a href="#contact" class="smoothScroll">Contact Us</a></li>  
                    <li><a href="/login" class="smoothScroll">Login</a></li>
                   
               </ul>
          </div>

     </div>
</div>


<!-- HOME -->
<section id="home" class="parallax-section">
     <div class="overlay"></div>
     <div class="container">
          <div class="row">

               <div class="col-md-8 col-sm-12">
                    <div class="home-text">
                         <h1>Risk Management System</h1>
                        
                    </div>
               </div>

          </div>
     </div>

<!--      Video -->
<!--      <video controls autoplay loop muted> -->
<!--           <source src="videos/loan_image.jpg" type="video/mp4"> -->
<!--           Your browser does not support the video tag. -->
<!--      </video> -->

<style>
body {
    background-image: url("image/rms3img.jpg");
}
</style>

</section>


<!-- ABOUT -->
<section id="about" class="parallax-section">
     <div class="container">
          <div class="row">

               <div class="col-md-offset-1 col-md-10 col-sm-12">
                    <div class="about-info">
                         <h1><bold>About Us</bold></h1>
                         <p align="justify"> RMS(risk management system) is a web application which will be used by multiple users like financial analysts who would like to 
evaluate an application, end users who want to apply for credit. The system should have capability to Submit an application (end user will do this),Run automated policies to decide whether to approve the credit or reject it(You have come up with a set 
of policies which get triggered on every submitted application to decide whether to approve or decline, and get a quick status of your applied application either approved or reject with in your profile.

                         </p>
                    </div>
               </div>

          </div>
     </div>
</section>


<!-- CONTACT -->


<!-- FOOTER -->
<footer id="contact" class="parallax-section">
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

               <div class="col-md-3 col-sm-12">
               		
                    <h2>About Us</h2>
                    <p align="justify">RMS provide quick status (approved or not approved) of your loan application</p>
                    <ul class="social-icon">
                         <li><a href="https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D" class="fa fa-twitter"></a></li>
                        <li><a href="https://www.facebook.com/login/" class="fa fa-facebook"></a></li>
                         <li><a href="https://www.instagram.com/accounts/login/?hl=en" class="fa fa-instagram"></a></li>
                         <li><a href="https://www.linkedin.com/login" class="fa fa-linkedin"></a></li>
                    </ul>
                    
               </div>

               <div class="clearfix"></div>

               <div class="col-md-12 col-sm-12">
                    <div class="copyright-text">
                         <p style="background-color:DarkGrey">2022 ©Risk Management System
                         
                       </p>
                    </div>
               </div>
               
          </div>
     </div>
</footer>

<!-- SCRIPTS -->
<script src="js/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.parallax.js"></script>
<script src="js/owl.carousel.min.js"></script>
<script src="js/jquery.magnific-popup.min.js"></script>
<script src="js/magnific-popup-options.js"></script>
<script src="js/modernizr.custom.js"></script>
<script src="js/smoothscroll.js"></script>
<script src="js/custom.js"></script>

</body>
</html>
