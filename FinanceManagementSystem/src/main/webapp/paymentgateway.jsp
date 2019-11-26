<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Payment Method</title>
</head>
<body>
<style>
h1 {
	font-family: 'Open Sans', sans-serif;
}

h2 {
	font-family: 'Open Sans', sans-serif;
}

/* Add a black background color to the top navigation */
.topnav {
	background-color: #0066cc;
	overflow: hidden;
}

/* Style the links inside the navigation bar */
.topnav a {
	float: right;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

/* Change the color of links on hover */
.topnav a:hover {
	background-color: #66b3ff;
	color: black;
}

/* Add a color to the active/current link */
.topnav a.active {
	background-color: #66b3ff;
	color: white;
}
</style>
	<div class="topnav">
	    <a href="logout.jsp">Logout</a> 
	    <a href="product_catalog">Products</a>
		<a href="contact.jsp">Contact</a>
		<a class="active" href="index.jsp">Home</a>
	</div>





	<div align="center"> <h1>Choose your emi-option</h1>
	</div>
	
	<form action="orderdetails" method="post">
		<table class="cinereousTable" align="center">
			<tr>
				<td>Emi opntion:
			
			<input type="text" name="emioption"></td>
			</tr>
			<tr>
				<td>Product Id:<input type="text" name="productid"></br></td>
			</tr>
			<tr>
				<td>User Id:<input type="text" name="userid"></br>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Submit" /></td>
			</tr>


		</table>

	</form>
</body>
</html>