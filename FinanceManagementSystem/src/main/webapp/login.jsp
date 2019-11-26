<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<style>
body {
	font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande',
		'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
}

#login {
	border: 1px #ddd solid;
	background-color: #fff;
	border-radius: 25px;
	width: 290px;
	height: 200px;
	padding: 40px;
	box-shadow: 5px 10px 20px #888888;
	position: absolute;
	top: 0;
	bottom: 0;
	left: 0;
	right: 0;
	margin: auto;
}

.button {
	background-color: dodgerblue;
	border: none;
	width: 100px;
	color: black;
	font-weight: bold;
	border-radius: 4px;
	padding: 10px 10px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 13px;
	margin: 4px 2px;
	cursor: pointer;
	-webkit-transition-duration: 0.4s; /* Safari */
	transition-duration: 0.4s;
}

.button2:hover {
	box-shadow: 0 12px 16px 0 rgba(0, 0, 0, 0.24), 0 17px 50px 0
		rgba(0, 0, 0, 0.19);
}

#table1 {
	margin: auto;
	position: absolute;
}

#inputarea {
	background-color: #f3f3f3;
	height: 31px;
	padding: 3px 7px;
	line-height: normal;
	border-radius: 3px;
	box-shadow: 0 1px 0 rgba(255, 255, 255, .5), 0 1px 0 rgba(0, 0, 0, .07)
		inset;
	outline: 0;
	border: 1px solid #a6a6a6;
}

#Forgot {
	text-align: center;
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
		<a class="active" href="index.jsp">Home</a> <a href="#contact">Contact</a>
		<a href="#about">About</a>
	</div>

	<div id="login">
		<form name="log" method="post" action="dashboard">
			<table id="table1" align="center">
				<div id="title">
					<h3 align="center">LOGIN</h3>
				</div>

				<tr>
					<td>Username</td>
					<td><input type="text" id="inputarea" size=25 name="username"
						placeholder="Enter username"></td>
				</tr>


				<tr>
					<td>Password</td>
					<td><input type="text" id="inputarea" size=25 name="password"
						placeholder="Enter password"></td>
				</tr>
				<tr>
					<td colspan="2" align="center">Forgot Password?<a href=#>Click
							here</a>
					</td>
				</tr>

				<tr>
					<td colspan="2" align="center"><button class="button button2">Login</button>
					</td>
				</tr>

			</table>

		</form>
	</div>
</body>
</html>