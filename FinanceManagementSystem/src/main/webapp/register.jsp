<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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





    <div id="register">
    <div id="user_register">
    <h3 align = "center">USER REGISTERATION FORM</h3>
    </div>
    <div id= "form">
    <form method="post"  action="registeration.lti">
    <table align="center" cellpadding = "10">
        
    <!----- Name ---------------------------------------------------------->
    <tr>
    <td>NAME</td>
    <td><input id="inputarea" type="text" name="name" maxlength="30"/>
    (max 30 characters a-z and A-Z)
    </td>
    </tr>
    
     <!----- Username ---------------------------------------------------------->
    <tr>
        <td>USERNAME</td>
        <td><input id="inputarea" type="text" name="username" maxlength="15" />
        (max 15 characters a-z,0-9 and A-Z)
        </td>
        </tr>
        
    <!----- Password---------------------------------------------------------->
    <tr>
        <td>PASSWORD</td>
        <td><input id="inputarea" type="text" name="password" maxlength="10" />
        (max 10 characters a-z,0-9 and A-Z)
        </td>
        </tr>
        
     <!----- Mobile Number ---------------------------------------------------------->
    <tr>
    <td>PHONE NUMBER</td>
    <td>
    <input id="inputarea" type="text" name="phone_no" maxlength="10" />
    (10 digit number)
    </td>
    </tr>
    

    <!----- Email Id ---------------------------------------------------------->
    <tr>
    <td>EMAIL ID</td>
    <td><input id="inputarea" type="text" name="email" maxlength="100" /></td>
    </tr>
 

    <!----- Address ---------------------------------------------------------->
        <tr>
        <td>ADDRESS <br /><br /><br /></td>
        <td><textarea id="inputarea" name="adddress" rows="4" cols="30"></textarea></td>
        </tr>


    <!----- Submit and Reset ------------------------------------------------->
    <tr>
    <td colspan="2" align="center">
    
    <!-- <a href="bankDetails.jsp" class="button button2" type="submit">NEXT</a> -->
    <button class= "button button2" type="submit">NEXT</button>
    <button class="button button2" type="reset" value="reset">RESET</button>
    </td>
    </tr>
    </table>
    <div id= "Already" align="center">
        Already a member?<a href="loginPage.jsp">Login here</a>
    </div>
    
    </form>
    </div>
</div>
</body>
</body>
</html>