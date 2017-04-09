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
</head><!--/head-->

<body>
	<header id="header"><!--header-->
		<div class="header-middle"><!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-sm-4">
						<div class="logo pull-left">
							<a href="index.jsp"><img src="images/home/logo.png" alt="" /></a>
						</div>
						
					</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
								<!-- <li><a href="checkout.jsp"><i class="fa fa-crosshairs"></i> Checkout</a></li>
								<li><a href="cart.jsp"><i class="fa fa-shopping-cart"></i> Cart</a></li> 
								<li><a href="login.jsp" class="active"><i class="fa fa-lock"></i> Login</a></li>-->
								<li><a href="logout"><i class="fa fa-lock"></i> Logout</a></li>
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
						<!-- <div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div> -->
						<div class="mainmenu pull-left">
							<!-- <ul class="nav navbar-nav collapse navbar-collapse">
								<li><a href="index.jsp">Home</a></li>
								<li class="dropdown"><a href="#">Shop<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="shop.jsp">Products</a></li>
										<li><a href="checkout.jsp">Checkout</a></li> 
										<li><a href="cart.jsp">Cart</a></li> 
										<li><a href="login.jsp" class="active">Login</a></li> 
                                    </ul>
                                </li> 
								<li><a href="contact-us.jsp">Contact</a></li>
							</ul> -->
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
					<h2>Manage your product Details</h2>
					<form action="addProduct" method="post">
							<input type="text" placeholder="Product Name" name="productActions.productName"/>
							<input type="text" placeholder="Product Brannd" name="productActions.productBrand"/>
							<input type="text" placeholder="Product Quantity" name="productActions.productQuantity"/>
							<input type="text" placeholder="Product Price" name="productActions.productPrice">
							<button type="submit" class="btn btn-default">Add product</button>
						</form>	
						
						<form action="updateProduct" method="post">
							<input type="text" placeholder="Product Name" name="productActions.productName" value='<s:property value="productVo.productName"/>'/>
							<input type="text" placeholder="Product Brannd" name="productActions.productBrand" value='<s:property value="productVo.productBrand"/>'/>
							<input type="text" placeholder="Product Quantity" name="productActions.productQuantity" value='<s:property value="productVo.productQuantity"/>'/>
							<input type="text" placeholder="Product Price" name="productActions.productPrice" value='<s:property value="productVo.productPrice"/>'/>
							<input type="hidden" name="productActions.productId" value='<s:property value="productVo.productId"/>'/>
							<button type="submit" class="btn btn-default">Update product</button>
						</form>	
					
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
                            Product Details
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                            <div class="table-responsive">
                                <table class="table table-striped table-bordered table-hover" id="dataTables-example">
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
                                            <td><s:property value="productName"/></td>
                                            <td><s:property value="productBrand"/></td>
                                            <td><s:property value="productQuantity"/></td>
                                            <td><s:property value="productPrice"/></td>
                                            <td><s:property value="isActive"/></td>
                                            <td class="center"><a href="deleteProduct?productId=<s:property value="productId"/>"><button type="button" class="btn btn-warning btn-circle"><i class="fa fa-times"></i>
                            </button></a> &nbsp;&nbsp;<a href="editProduct?productId=<s:property value="productId"/>"><button type="button" class="btn btn-warning btn-circle"><i class="fa fa-edit fa-fw"></i>
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
    <script src="js/main.js"></script>
     <!-- Page-Level Plugin Scripts - Tables -->
    <script src="js/dataTables/jquery.dataTables.js"></script>
    <script src="js/dataTables/dataTables.bootstrap.js"></script>
     <!-- Page-Level Demo Scripts - Tables - Use for reference -->
    <script>
    $(document).ready(function() {
        $('#dataTables-example').dataTable();
    });
    </script>
    
</body>
</html>