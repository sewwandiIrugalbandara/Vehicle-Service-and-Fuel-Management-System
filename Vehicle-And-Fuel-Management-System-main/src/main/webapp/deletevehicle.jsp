<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	 <link rel="stylesheet" type="text/css" href="styles/deleteu.css"/>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<body>


	<div class="container">
      
		<div class="navbar"> 
		<img src="logo.png" class="logo1">
		<nav> 
			<ul> 
				<li><a href="home2.jsp">Home</a></li>
            <li><a href="contactus.jsp">Contact Us</a></li>
            <li><a href="aboutus.jsp">About Us</a></li>
            
				
			</ul>
		</nav>
    </div>
    </div>

	<%
	String vid = request.getParameter("vid");
	String vtype = request.getParameter("vtype");
	String voname = request.getParameter("voname");
	String vophone = request.getParameter("vophone");
	String servicetype = request.getParameter("servicetype");
	String vnumber = request.getParameter("vnumber");
	%>

	<h1>Vehicle Account Delete</h1>

	<div class="container1">
	<form action="deletevehicle" method="post">
	<table>
		<tr>
			<td>Vehicle ID</td>
			<td><input type="text" name="vid" value="<%= vid %>" readonly></td>
		</tr>
		<tr>
			<td>Vehicle Type</td>
			<td><input type="text" name="vtype" value="<%= vtype %>"></td>
		</tr>
		<tr>
		<td>Vehicle Owner Name</td>
		<td><input type="text" name="voname" value="<%= voname %>"></td>
	</tr>
	<tr>
		<td>Vehicle Owner Phone number</td>
		<td><input type="text" name="vophone" value="<%= vophone %>"></td>
	</tr>
	<tr>
		<td>Service type</td>
		<td><input type="text" name="servicetype" value="<%= servicetype %>"></td>
	</tr>
			
	</table>
	<br>
	<input type="submit" name="submit" value="Delete My Account">
	</form>
	</div>

</body>
</html>