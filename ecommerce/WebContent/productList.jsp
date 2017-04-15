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
				<form action="addProduct" method="post" enctype="multipart/form-data" name="product-form" id="product-form">

					<div class="row">

						<div class="col-sm-12">

							<h2>Manage your product Details</h2>

							<div class="col-sm-4">
								<input type="text" placeholder="Product Name"
									name="productActions.productName" id="productName"/>
							</div>
							<div class="col-sm-4">
								<input type="text" placeholder="Product Brannd"
									name="productActions.productBrand" id="productBrand"/>
							</div>
							<div class="col-sm-4">
								<input type="text" placeholder="Product Quantity"
									name="productActions.productQuantity" id="productQuantity"/>
							</div>

							<div class="col-sm-4">
								<input type="text" placeholder="Product Price"
									name="productActions.productPrice" id="productPrice">
							</div>

						</div>

					</div>
					<div class="row">
						<div class="col-sm-12">
							<div class="col-sm-6">
								<textarea rows="5" cols="3" placeholder="Product Details"
									name="productActions.productDetails" id="productDetails"></textarea>
							</div>
							<div class="col-sm-3 ">
							<s:file name="userImage" label="Image" class="btn btn-default" id="userImage"/> 
							</div>
							<div class="col-sm-3 ">
								<button type="submit" class="btn btn-default">Add
									product</button>
							</div>
							
						</div>
					</div>
				</form>
			</div>
			<br/>
			<div class="row">
				<div class="col-lg-12">
					<div class="panel panel-default">
						<div class="panel-heading">Product Details</div>
						<!-- /.panel-heading -->
						<div class="panel-body">
							<div class="table-responsive">
								<table class="table table-striped table-bordered table-hover"
									id="dataTables-example">
									<thead>
										<tr>
											<th>Name</th>
											<th>Brannd</th>
											<th>Quantity</th>
											<th>Price</th>
											<th>Active</th>
											<th>Action</th>
										</tr>
									</thead>
									<tbody>
										<s:iterator value="productList">
											<tr class="gradeU">
												<td><s:property value="productName" /></td>
												<td><s:property value="productBrand" /></td>
												<td><s:property value="productQuantity" /></td>
												<td><s:property value="productPrice" /></td>
												<td><s:property value="isActive" /></td>
												<td class="center"><a
													href="deleteProduct?productId=<s:property value="productId"/>"><button
															type="button" class="btn btn-warning btn-circle">
															<i class="fa fa-times"></i>
														</button></a> &nbsp;&nbsp;<a
													href="editProduct?productId=<s:property value="productId"/>"><button
															type="button" class="btn btn-warning btn-circle">
															<i class="fa fa-edit fa-fw"></i>
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
			<div class="row" id="updateDiv" style="display:block">

				<div class="login-form">
					<!--login form-->
					<form action="updateProduct" method="post" name="updateproduct-form" id="updateproduct-form">

						<div class="row">

							<div class="col-sm-12">
								<div class="col-sm-3">
									<input type="text" placeholder="Product Name"
										name="productActions.productName"
										value='<s:property value="productVo.productName"/>' id="uproductName"/>
								</div>
								<div class="col-sm-3">
									<input type="text" placeholder="Product Brannd"
										name="productActions.productBrand"
										value='<s:property value="productVo.productBrand"/>' id="uproductBrand"/>
								</div>

								<div class="col-sm-3">
									<input type="text" placeholder="Product Quantity"
										name="productActions.productQuantity"
										value='<s:property value="productVo.productQuantity"/>' id="uproductQuantity"/>
								</div>

								<div class="col-sm-3">
									<input type="text" placeholder="Product Price"
										name="productActions.productPrice"
										value='<s:property value="productVo.productPrice"/>' id="uproductPrice">
								</div>

							</div>

						</div>
						<div class="row">
							<div class="col-sm-12">
								<div class="col-sm-6">
									<input type="hidden" name="productActions.productId" id="uproductId"
										value='<s:property value="productVo.productId"/>' > 
									<textarea rows="5" cols="3"
										name="productActions.productDetails" id="uproductDetails"><s:property
											value="productVo.productDetails" /></textarea>
								</div>
								<div class="col-sm-4 ">
									<button type="submit" class="btn btn-default">Update
										product</button>
								</div>
								<div class="col-sm-4 "></div>
							</div>
						</div>
					</form>
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
	<script src="js/dataTables/jquery.dataTables.js"></script>
	<script src="js/dataTables/dataTables.bootstrap.js"></script>
	<!-- Page-Level Demo Scripts - Tables - Use for reference -->
	<script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>
    <script src='<s:url value="jQuery/jQuery-2.1.4.min.js"/>'></script>
    <script src='<s:url value="jQuery/jquery.validate.min.js"/>'></script>
<script type="text/javascript">
    $(function() {
  	  
	    $("#product-form").validate({
	    	submitHandler: function(form) {
	            form.submit();
	        }
	    });
	    $('#productName').rules("add",
	    		{
	    		    required: true,
	    		    messages: { required: 'Product name is required.' }
	    		});
	    $('#productBrand').rules("add",
	    		{
	    		    required: true,
	    		    messages: { required: 'Product Brand is required.' }
	    		});
	    $('#productQuantity').rules("add",
	    		{
	    		    required: true,
	    		    minlength:0,
	    		    maxlength:5,
	    		    number: true,
	    		    messages: { required: 'Please enter productQuantity',number:'Number only',maxlength:'5 digit Quantity '}
	    		});
	    $('#productPrice').rules("add",
	    		{
	    		    required: true,
	    		    minlength:0,
	    		    maxlength:10,
	    		    number: true,
	    		    messages: { required: 'Please enter valid price',number:'Number only',maxlength:'10 digit amount'}
	    		});
	    $('#productDetails').rules("add",
	       		{
	       		    required: true,
	       		    messages: { required: 'Please enter product details'}
	       		});
	    $('#userImage').rules("add",
	       		{
	    			required: true,
	        		accept: "image/jpeg, image/pjpeg, image/png",
	       		    messages: { required: 'Please select aleast one image file',accept:'Image file only'}
	       		});
	});
    
    $(function() {
    	  
	    $("#updateproduct-form").validate({
	    	submitHandler: function(form) {
	            form.submit();
	        }
	    });
	    $('#uproductName').rules("add",
	    		{
	    		    required: true,
	    		    messages: { required: 'Product name is required.' }
	    		});
	    $('#uproductBrand').rules("add",
	    		{
	    		    required: true,
	    		    messages: { required: 'Product Brand is required.' }
	    		});
	    $('#uproductQuantity').rules("add",
	    		{
	    		    required: true,
	    		    minlength:0,
	    		    maxlength:5,
	    		    number: true,
	    		    messages: { required: 'Please enter productQuantity',number:'Number only',maxlength:'5 digit Quantity '}
	    		});
	    $('#uproductPrice').rules("add",
	    		{
	    		    required: true,
	    		    minlength:0,
	    		    maxlength:10,
	    		    number: true,
	    		    messages: { required: 'Please enter valid price',number:'Number only',maxlength:'10 digit amount'}
	    		});
	    $('#uproductDetails').rules("add",
	       		{
	       		    required: true,
	       		    messages: { required: 'Please enter product details'}
	       		});
	    
	});
    
    </script>
</body>
</html>