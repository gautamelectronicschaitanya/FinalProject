<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>product</title>
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
	
	<table align="center" border="2" width="90%" cellpadding="30">
	
  <tr>
    <th>PRODUCT ID</th>
    <th>PRODUCT NAME</th>
    <th>PRODUCT INFO</th>
    <th>PRODUCT AMOUNT</th>
    <th>PRODUCT IMAGE</th>
  </tr>
  <c:forEach var="p" items="${p}">
  <tr>
    <td>${p.pid}</td>        
    <td>${p.productname}</td></br>
    <td>${p.productinfo}</td></br>
    <td>${p.amount}</td></br>
    <td>${p.image}</td></br>
    
     <td><a href="paymentgateway">Buy-Now</a></td>
  </tr>
  
  <tr>
    </tr>
     </c:forEach>
</table>


<a href="paymentgateway">Buy-Now</a>
</body>
</html>