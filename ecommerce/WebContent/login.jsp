<!DOCTYPE html>
<html lang="en">
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description" content="">
<meta name="author" content="">
<title>Login | E-Shopper</title>
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/font-awesome.min.css" rel="stylesheet">
<link href="css/prettyPhoto.css" rel="stylesheet">
<link href="css/price-range.css" rel="stylesheet">
<link href="css/animate.css" rel="stylesheet">
<link href="css/main.css" rel="stylesheet">
<link href="css/responsive.css" rel="stylesheet">
<!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->
<link rel="shortcut icon" href="images/ico/favicon.ico">
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="images/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="images/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="images/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="images/ico/apple-touch-icon-57-precomposed.png">
<!-- jQuery Form Validation code -->

</head>
<!--/head-->

<body>
	<header id="header">
		<!--header-->
		<div class="header-middle">
			<!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-sm-4">
						<div class="logo pull-left">
							<a href="homePage?useraction=Home"><img
								src="images/home/logo.png" alt="" /></a>
						</div>

					</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!--/header-middle-->

		<div class="header-bottom">
			<!--header-bottom-->
			<div class="container">
				<div class="row">
					<div class="col-sm-9">
						<div class="mainmenu pull-left"></div>
					</div>

				</div>
			</div>
		</div>
		<!--/header-bottom-->
	</header>
	<!--/header-->

	<section id="form" style="margin-top: 0">
		<!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-4 col-sm-offset-1">
					<div class="login-form">
						<!--login form-->
						<h2>Login to your account</h2>
						<form action="logincheck" method="post" name="login-form"
							id="login-form">
							<input type="text" placeholder="First Name"
								name="userAction.firstName" id="loginfirstName" /> <input
								type="password" placeholder="Password"
								name="userAction.password" id="loginpassword" />
							<button type="submit" class="btn btn-default">Login</button>
						</form>
					</div>
					<!--/login form-->
				</div>
				<div class="col-sm-1">
					<h2 class="or">OR</h2>
				</div>
				<div class="col-sm-4">
					<div class="signup-form">
						<!--sign up form-->
						<h2>New User Signup!</h2>
						<% if(null!=request.getAttribute("msg")) {%>
						<h5><%=request.getAttribute("msg") %></h5>
						<%}%>
						<form action="registerUser" method="post" name="register-form"
							id="register-form">
							<input type="text" placeholder="First Name"
								name="userAction.firstName" id="firstName" /> <input
								type="text" placeholder="Last Name" name="userAction.lastName"
								id="lastName" />
							<!-- <input type="email" placeholder="Email Address" name="userAction.emailId" id="email"/> -->
							<input type="password" placeholder="Password"
								name="userAction.password" id="password" /> 
							<input type="text" placeholder="Username"
								name="userAction.username" id="username" /> <input type="hidden"
								name="userAction.userRole" value="user">
							<button type="submit" class="btn btn-default">Signup</button>
						</form>
					</div>
					<!--/sign up form-->
				</div>
			</div>
		</div>
	</section>
	<!--/form-->


	<footer id="footer">
		<!--Footer-->
		<div class="footer-top">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						<div class="companyinfo">
							<h2>
								<span>e</span>-shopper
							</h2>
							<p>Shop the way you want</p>
						</div>
					</div>
					<div class="col-sm-7">
						<div class="col-sm-3"></div>

						<div class="col-sm-3"></div>

						<div class="col-sm-3"></div>

						<div class="col-sm-3"></div>
					</div>
					<div class="col-sm-3">
						<div class="address">
							<img src="images/home/map.png" alt="" />
							<p>505 S Atlantic Ave Virginia Beach, VA(Virginia)</p>
						</div>
					</div>
				</div>
			</div>
		</div>



		<div class="footer-bottom">
			<div class="container">
				<div class="row">
					<p class="pull-left">Copyright © 2017 E-SHOPPER Inc. All
						rights reserved.</p>
					<p class="pull-right">
						Designed by <span><a target="_blank" href="#">:)</a></span>
					</p>
				</div>
			</div>
		</div>

	</footer>
	<!--/Footer-->



	<script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
	<script src="js/jquery.prettyPhoto.js"></script>
	<%-- <script src="js/main.js"></script> --%>
	<!-- jQuery 2.1.4 -->
	<script src='<s:url value="jQuery/jQuery-2.1.4.min.js"/>'></script>
	<script src='<s:url value="jQuery/jquery.validate.min.js"/>'></script>
	<script type="text/javascript">

  
  $(function() {
	  
	    $("#register-form").validate({
	    	submitHandler: function(form) {
	            form.submit();
	        }
	    });
	    $('#firstName').rules("add",
	    		{
	    		    required: true,
	    		    messages: { required: 'First name is required.' }
	    		});
	    $('#lastName').rules("add",
	    		{
	    		    required: true,
	    		    messages: { required: 'Last name is required.' }
	    		});
	   /*  $('#email').rules("add",
	    		{
	    		    required: true,
	    		    email: true,
	    		    messages: { required: 'Please enter a valid email address' }
	    		}); */
	    $('#password').rules("add",
	    		{
	    		    required: true,
	    		    minlength: 5,
	    		    messages: 
	    		    { required: 'Please enter password',
	    		    	minlength: 'Your password must be at least 5 characters long'
	    		    	}
	    		});
	    $('#username').rules("add",
	    		{
	    		    required: true,
	    		    number: true,
	    		    minlength:9,
	    		    maxlength:9,
	    		    messages: { required: 'Please enter username',number:'Number only',minlength:'9 digit username',maxlength:'9 digit username'}
	    		});		
	});
  
$(function() {
	$("#login-form").validate({
    	submitHandler: function(form) {
            form.submit();
        }
    });
	 $('#loginfirstName').rules("add",
	    		{
	    		    required: true,
	    		    messages: { required: 'First name is required.' }
	    		});
	 $('#loginpassword').rules("add",
	    		{
	    		    required: true,
	    		    minlength: 5,
	    		    messages: 
	    		    { required: 'Please enter password',
	    		    	minlength: 'Your password must be at least 5 characters long'
	    		    	}
	    		});
	  
  });
  </script>
</body>
</html>