<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="images/ico/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="images/ico/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="images/ico/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="images/ico/apple-touch-icon-57-precomposed.png">
</head>
<!--/head-->
<script type="text/javascript">
//div with a specific ID
function div(){
var productId=document.getElementById("uproductId").value;
if(productId==null||productId==''||productId==0){
	document.getElementById("updateDiv").style.display='none';
}
}
</script>
<body onload="div();">
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
								<li><a href="logout?useraction=Logout"><i
										class="fa fa-lock"></i> Logout</a></li>
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
			<div class="login-form">
				<!--login form-->
				<form action="addProductImage" method="post" enctype="multipart/form-data" name="product-form" id="product-form">

					<div class="row">
<input type="hidden" name="productActions.productId" id="uproductId"
										value='<s:property value="productVo.productId"/>' >
						<div class="col-sm-12">

							<h2>Manage product Images</h2>
							<h5>Upload Thumbnel Image</h5>	
							<div class="col-sm-4">
							<s:file name="thumbnelImage1" label="Image" class="btn btn-default" id="userThumbnelImage1"/>
							</div>
							<div class="col-sm-4">
							<s:file name="thumbnelImage2" label="Image" class="btn btn-default" id="userThumbnelImage2"/>
							</div>
							<div class="col-sm-4">
							<s:file name="thumbnelImage3" label="Image" class="btn btn-default" id="userThumbnelImage3"/>
							</div>
							</div>
						<div class="col-sm-12">	
							<br/>
							<h5>Upload Larger Image same as thumbnelImage</h5>
							<div class="col-sm-4">
							<s:file name="largerImage1" label="Image" class="btn btn-default" id="largerImage1"/>
							</div>
							<div class="col-sm-4">
							<s:file name="largerImage2" label="Image" class="btn btn-default" id="largerImage2"/>
							</div>
							<div class="col-sm-4">
							<s:file name="largerImage3" label="Image" class="btn btn-default" id="largerImage3"/>
							</div>  

						</div>

					</div>
					<div class="row">
						<div class="col-sm-12">
							<div class="col-sm-3 ">
								<button type="submit" class="btn btn-default">Add
									product</button>
							</div>
							
						</div>
					</div>
				</form>
			</div>
			<br/>
		
			
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
	<script src="js/dataTables/jquery.dataTables.js"></script>
	<script src="js/dataTables/dataTables.bootstrap.js"></script>
	<!-- Page-Level Demo Scripts - Tables - Use for reference -->

    <%-- <script src="jQuery/jQuery-2.1.4.min.js"/></script> --%>
    <script src="jQuery/jquery.validate.min.js"/></script>
    	<script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>
<script type="text/javascript">
    $(function() {
  	  
	    $("#product-form").validate({
	    	submitHandler: function(form) {
	            form.submit();
	        }
	    });
	    $('#userThumbnelImage1').rules("add",
	       		{
	    			required: true,
	        		//accept: "image/jpeg, image/jpg, image/png,image/PNG",
	       		    messages: { required: 'Please select aleast one thumbnel image file',accept:'Image file only'}
	       		});
	    $('#userThumbnelImage2').rules("add",
	       		{
	    			required: true,
	        		//accept: "image/jpeg, image/jpg, image/png,image/PNG",
	       		    messages: { required: 'Please select aleast one thumbnel image file',accept:'Image file only'}
	       		});
	    $('#userThumbnelImage3').rules("add",
	       		{
	    			required: true,
	        		//accept: "image/jpeg, image/jpg, image/png,image/PNG",
	       		    messages: { required: 'Please select aleast one thumbnel image file',accept:'Image file only'}
	       		});
	    $('#largerImage1').rules("add",
	       		{
	    			required: true,
	        		//accept: "image/jpeg, image/jpg, image/png,image/PNG",
	       		    messages: { required: 'Please select aleast one largeimage file',accept:'Image file only'}
	       		});
	    $('#largerImage2').rules("add",
	       		{
	    			required: true,
	        		//accept: "image/jpeg, image/jpg, image/png,image/PNG",
	       		    messages: { required: 'Please select aleast one largeimage file',accept:'Image file only'}
	       		});
	    $('#largerImage3').rules("add",
	       		{
	    			required: true,
	        		//accept: "image/jpeg, image/jpg, image/png,image/PNG",
	       		    messages: { required: 'Please select aleast one largeimage file',accept:'Image file only'}
	       		});
	});
    
      
    </script>
</body>
</html>