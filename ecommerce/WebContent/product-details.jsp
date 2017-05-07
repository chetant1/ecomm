<!DOCTYPE html>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Home | E-Shopper</title>
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
    
    <style type="text/css">
    ::-webkit-scrollbar {
    width: 12px;
}
 
::-webkit-scrollbar-track {
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3); 
    border-radius: 10px;
}
 
::-webkit-scrollbar-thumb {
    border-radius: 10px;
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.5); 
}
    
    ul.enlarge{
list-style-type:none; /*remove the bullet point*/
margin-left:0;
}
ul.enlarge li{
display:inline-block; /*places the images in a line*/
position: relative;
z-index: 0; /*resets the stack order of the list items - later we'll increase this*/
margin:10px 40px 0 20px;
}
ul.enlarge img{
background-color:#eae9d4;
padding: 6px;
-webkit-box-shadow: 0 0 6px rgba(132, 132, 132, .75);
-moz-box-shadow: 0 0 6px rgba(132, 132, 132, .75);
box-shadow: 0 0 6px rgba(132, 132, 132, .75);
-webkit-border-radius: 4px; 
-moz-border-radius: 4px; 
border-radius: 4px; 
}
ul.enlarge span{
position:absolute;
left: -9999px;
background-color:#eae9d4;
padding: 10px;
font-family: 'Droid Sans', sans-serif;
font-size:.9em;
text-align: center; 
color: #495a62; 
-webkit-box-shadow: 0 0 20px rgba(0,0,0, .75));
-moz-box-shadow: 0 0 20px rgba(0,0,0, .75);
box-shadow: 0 0 20px rgba(0,0,0, .75);
-webkit-border-radius: 8px; 
-moz-border-radius: 8px; 
border-radius:8px;
}
ul.enlarge li:hover{
z-index: 50;
cursor:pointer;
}
ul.enlarge span img{
padding:2px;
background:#ccc;
}
ul.enlarge li:hover span{ 
top: -10px; /*the distance from the bottom of the thumbnail to the top of the popup image*/
left: -80px; /*distance from the left of the thumbnail to the left of the popup image*/
}
/* ul.enlarge li:hover:nth-child(2) span{ 
top: -10px;
left: -60px;    
}
ul.enlarge li:hover:nth-child(3) span{
top: -10px;
left: -60px;
bottom: -10px;  
} */
/**IE Hacks - see http://css3pie.com/ for more info on how to use CS3Pie and to download the latest version**/
ul.enlarge img, ul.enlarge span{
behavior: url(pie/PIE.htc); 
}
    
    </style>
</head><!--/head-->

<body>
	<header id="header"><!--header-->
		
		
		<div class="header-middle"><!--header-middle-->
			<div class="container">
				<div class="row">
					<div class="col-sm-4">
						<div class="logo pull-left">
							<a href="homePage?useraction=Home"><img src="images/home/logo.png" alt="" /></a>
						</div>
						<div class="btn-group pull-right">
						</div>
					</div>
					<div class="col-sm-8">
						<div class="shop-menu pull-right">
							<ul class="nav navbar-nav">
								<li><a href="getAllUserCartProducts?useraction=Cart"><i class="fa fa-shopping-cart"></i> Cart</a></li>
								<li><a href="logout?useraction=Logout"><i class="fa fa-lock"></i> Logout</a></li>
								<li><a href="userDetails?useraction=AccountDetails"><i class="fa fa-user"></i><s:property value="#session.fName"/></a></li>
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
						<div class="navbar-header">
							<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<div class="mainmenu pull-left">
							<ul class="nav navbar-nav collapse navbar-collapse">
								<li><a href="homePage?useraction=Home" class="active">Home</a></li>
								<li class="dropdown"><a href="#">Shop<i class="fa fa-angle-down"></i></a>
                                    <ul role="menu" class="sub-menu">
                                        <li><a href="getUserProductList?useraction=Products">Products</a></li>
                                    </ul>
                                </li> 
								<li><a href="contact-us.jsp">Contact</a></li>
							</ul>
						</div>
					</div>
					
				</div>
			</div>
		</div><!--/header-bottom-->
	</header><!--/header-->
	
	<section>
		<div class="container">
			<div class="row">
				<div class="col-sm-12 padding-right">
					<div class="product-details"><!--product-details-->
						<div class="col-sm-3">
							<div class="view-product">
								<img src="<s:property value="productVo.productDetailsmainImageFileName"/>" alt="" />
								
							</div>
							

						</div>
					
						<div class="col-sm-6">
						<form action="productToCart?useraction=Add to Cart_<s:property value="productVo.productName"/>" method="post">
							<div class="product-information"><!--/product-information-->
							
								<img src="images/product-details/new.jpg" class="newarrival" alt="" />
								<h2><s:property value="productVo.productName"/></h2>
								<span>
									<span>US $<input type="text" name="userProductActions.productPrice" value='<s:property value="productVo.productPrice"/>'/></span>
									<label>In Stock:<s:property value="productVo.productQuantity"/></label>
									<label>Quantity:<input name="userProductActions.userProductQuantity" type="text" value="1" /></label>
								</span>
								<p><b>Condition:</b> New</p>
								<p><b>Brand:</b><s:property value="productVo.productBrand"/></p>
								<p><b>Type:</b><s:property value="productVo.productType"/></p>
								<input type="hidden" name="userProductActions.purchaseStatus" value="InCart">
								<input type="hidden" name="userProductActions.productId" value='<s:property value="productId"/>'/>
								 <input type="submit" class="btn btn-default add-to-cart" value="Add to cart">
								 <h2>Details</h2>
								 <s:property
											value="productVo.productDetails" /> 
							</div><!--/product-information-->
						</form>
						</div>
						<div class="col-sm-3" style=" overflow: auto">
								<ul class="enlarge">
<li><img src="<s:property value="productVo.thumbnelImage1FileName"/>" width="150px" height="100px" alt="Dechairs" class="img-responsive"/><span><img src="<s:property value="productVo.largerImage1FileName"/>" alt="Deckchairs" /></span></li>
<li><img src="<s:property value="productVo.thumbnelImage2FileName"/>" width="150px" height="100px" alt="Blackpool pier" class="img-responsive"/><span><img src="<s:property value="productVo.largerImage2FileName"/>" alt="Blackpool pier" /><br /></span></li>
<li><img src="<s:property value="productVo.thumbnelImage3FileName"/>" width="150px" height="100px" alt="Blackpool pier" class="img-responsive"/><span><img src="<s:property value="productVo.largerImage3FileName"/>" alt="Blackpool pier" /><br /></span></li>
</ul>
						</div>
					</div><!--/product-details-->
				</div>
					<div class="col-sm-2">
							<!-- <div class="view-product">
								<img src="images/product-details/1.jpg" alt="" />
								
							</div> -->
							
							
						</div>
			</div>
		</div>
	</section>
	
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
</body>
</html>