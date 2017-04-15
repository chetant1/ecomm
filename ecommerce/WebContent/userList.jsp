<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
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
	 <!-- Page-Level Plugin CSS - Tables -->
    <link href="css/dataTables/dataTables.bootstrap.css" rel="stylesheet">
    <!--[if lt IE 9]>
    <script src="js/html5shiv.js"></script>
    <script src="js/respond.min.js"></script>
    <![endif]-->       
    <link rel="shortcut icon" href="images/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="images/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="images/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="images/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="images/ico/apple-touch-icon-57-precomposed.png">
    <script type="text/javascript">
//div with a specific ID
function div(){
var userId=document.getElementById("uuserId").value;
if(userId==null||userId==''||userId==0){
	document.getElementById("updateDiv").style.display='none';
}
}
</script>
</head><!--/head-->

<body onload="div();">
	<header id="header"><!--header-->
		<div class="header-middle"><!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-sm-4">
						<div class="logo pull-left">
							<a href="homePage?useraction=Home"><img src="images/home/logo.png" alt="" /></a>
						</div>
						
					</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
								<!-- <li><a href="checkout.jsp"><i class="fa fa-crosshairs"></i> Checkout</a></li>
								<li><a href="cart.jsp"><i class="fa fa-shopping-cart"></i> Cart</a></li> 
								-->
								<li><a href="logout?useraction=Logout"><i class="fa fa-lock"></i> Logout</a></li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</div><!--/header-middle-->
	
		<div class="header-bottom"><!--header-bottom-->
			<div class="container">
				<div class="row">
					<div class="col-sm-9">
						<div class="mainmenu pull-left">
						</div>
					</div>
					
				</div>
			</div>
		</div><!--/header-bottom-->
	</header><!--/header-->
	
	<section id="form" style="margin-top: 0"><!--form-->
		<div class="container">
			<div class="row">
				<div class="col-sm-3 col-sm-offset-1">
					<div class="login-form"><!--login form-->
					<h2>Manage user Details</h2>
					<form action="addUser" method="post" name="register-form" id="register-form">
							<input type="text" placeholder="First Name" name="userAction.firstName" id="firstName" />
							<input type="text" placeholder="Last Name" name="userAction.lastName" id="lastName"/>
							<input type="text" placeholder="Email" name="userAction.emailId" id="email"/>
							<input type="text" placeholder="Mobile No" name="userAction.mobileNumber" id="mobile">
							<input type="password" placeholder="Password" name="userAction.password" id="password"/>
							<input type="hidden" name="userAction.userRole" value="user">
							<button type="submit" class="btn btn-default">Add User</button>
						</form>	
						<%-- 
						<form action="updateUser" method="post" name="update-form" id="update-form">
							<input type="text" placeholder="First Name" name="userAction.firstName" id="ufirstName" value='<s:property value="userVo.firstName"/>'/>
							<input type="text" placeholder="Last Name" name="userAction.lastName" id="ulastName" value='<s:property value="userVo.lastName"/>'/>
							<input type="text" placeholder="Email" name="userAction.emailId" id="uemail" value='<s:property value="userVo.emailId"/>'/>
							<input type="text" placeholder="Mobile No" name="userAction.mobileNumber" id="umobile" value='<s:property value="userVo.mobileNumber"/>'/>
							<input type="hidden" name="userAction.userId" value='<s:property value="userVo.userId"/>'/>
							<button type="submit" class="btn btn-default">Update User</button>
						</form>	
					 --%>
					</div><!--/login form-->
				</div>
				<!-- <div class="col-sm-1">
					<h2 class="or">AND</h2>
				</div> --> <br/>
				<div class="col-sm-8">
				<div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            User Details
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
                                    <thead>
                                        <tr>
                                            <th>First Name</th>
                                            <th>Last Name</th>
                                            <th>Email</th>
                                            <th>Mobile No</th>
                                            <th>Active</th>
                                            <th>Action</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                    <s:iterator value="userList">
                                        <tr class="gradeU">
                                            <td><s:property value="firstName"/></td>
                                            <td><s:property value="lastName"/></td>
                                            <td><s:property value="emailId"/></td>
                                            <td><s:property value="mobileNumber"/></td>
                                            <td><s:property value="isActive"/></td>
                                            <td class="center"><a href="deleteUser?userId=<s:property value="userId"/>"><button type="button" class="btn btn-warning btn-circle"><i class="fa fa-times"></i>
                            </button></a> &nbsp;&nbsp;<a href="editUser?userId=<s:property value="userId"/>"><button type="button" class="btn btn-warning btn-circle"><i class="fa fa-edit fa-fw"></i>
                            </button></a></td>
                                        </tr>
                                        </s:iterator>
                                    </tbody>
                                </table>
                            </div>
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
				
				<div class="row" id="updateDiv" style="display:block">

				<div class="login-form">
					<!--login form-->
					<form action="updateUser" method="post" name="update-form" id="update-form">

						<div class="row">

							<div class="col-sm-12">
								<div class="col-sm-3">
									<input type="text" placeholder="First Name" name="userAction.firstName" id="ufirstName" value='<s:property value="userVo.firstName"/>'/>
								</div>
								<div class="col-sm-3">
									<input type="text" placeholder="Last Name" name="userAction.lastName" id="ulastName" value='<s:property value="userVo.lastName"/>'/>
								</div>

								<div class="col-sm-3">
									<input type="text" placeholder="Email" name="userAction.emailId" id="uemail" value='<s:property value="userVo.emailId"/>'/>
								</div>

								<div class="col-sm-3">
									<input type="text" placeholder="Mobile No" name="userAction.mobileNumber" id="umobile" value='<s:property value="userVo.mobileNumber"/>'/>
							<input type="hidden" name="userAction.userId" id="uuserId" value='<s:property value="userVo.userId"/>'/>
								</div>

							</div>

						</div>
						<div class="row">
							<div class="col-sm-12">
								<div class="col-sm-4 ">
									<button type="submit" class="btn btn-default">Update User</button>
								</div>
								<div class="col-sm-4 "></div>
							</div>
						</div>
					</form>
				</div>
			</div>
				
				
				
					
				</div>
			</div>
		</div>
	</section><!--/form-->
	
	
	<footer id="footer"><!--Footer-->
		<div class="footer-top">
			<div class="container">
				<div class="row">
					<div class="col-sm-2">
						<div class="companyinfo">
							<h2><span>e</span>-shopper</h2>
							<p>Shop the way you want</p>
						</div>
					</div>
					<div class="col-sm-7">
						<div class="col-sm-3">

						</div>
						
						<div class="col-sm-3">
							
						</div>
						
						<div class="col-sm-3">
							
						</div>
						
						<div class="col-sm-3">
							
						</div>
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
					<p class="pull-left">Copyright © 2017 E-SHOPPER Inc. All rights reserved.</p>
					<p class="pull-right">Designed by <span><a target="_blank" href="#">:)</a></span></p>
				</div>
			</div>
		</div>
		
	</footer><!--/Footer-->
	

  
    <script src="js/jquery.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.scrollUp.min.js"></script>
	<script src="js/price-range.js"></script>
    <script src="js/jquery.prettyPhoto.js"></script>
    <%-- <script src="js/main.js"></script> --%>
    <!-- Page-Level Plugin Scripts - Tables -->
    <script src="js/dataTables/jquery.dataTables.js"></script>
    <script src="js/dataTables/dataTables.bootstrap.js"></script>
     <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>
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
	    $('#email').rules("add",
	    		{
	    		    required: true,
	    		    email: true,
	    		    messages: { required: 'Please enter a valid email address' }
	    		});
	    $('#mobile').rules("add",
	    		{
	    		    required: true,
	    		    minlength:10,
	    		    maxlength:10,
	    		    number: true,
	    		    messages: { required: 'Please enter valid mobile number',number:'Number only',maxlength:'10 digit mobile number'}
	    		});
	    $('#password').rules("add",
	    		{
	    		    required: true,
	    		    minlength: 5,
	    		    messages: 
	    		    { required: 'Please enter password',
	    		    	minlength: 'Your password must be at least 5 characters long'
	    		    	}
	    		});
	});
    
    $(function() {
    	  
	    $("#update-form").validate({
	    	submitHandler: function(form) {
	            form.submit();
	        }
	    });
	    $('#ufirstName').rules("add",
	    		{
	    		    required: true,
	    		    messages: { required: 'First name is required.' }
	    		});
	    $('#ulastName').rules("add",
	    		{
	    		    required: true,
	    		    messages: { required: 'Last name is required.' }
	    		});
	    $('#uemail').rules("add",
	    		{
	    		    required: true,
	    		    email: true,
	    		    messages: { required: 'Please enter a valid email address' }
	    		});
	    $('#umobile').rules("add",
	    		{
	    		    required: true,
	    		    minlength:10,
	    		    maxlength:10,
	    		    number: true,
	    		    messages: { required: 'Please enter valid mobile number',number:'Number only',maxlength:'10 digit mobile number'}
	    		});
	    
	});
    
    
    </script>
</body>
</html>