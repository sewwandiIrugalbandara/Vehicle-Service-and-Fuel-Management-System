<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	 <link rel="stylesheet" type="text/css" href="styles/deleteu.css"/>
	<meta charset="UTF-8">
	<title>delete report</title>
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
	String rid = request.getParameter("rid");
	String reportid = request.getParameter("reportid");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
	%>

	<h1>Report Details Delete</h1>

	<div class="container1">
	<form action="deletereport" method="post">
	<table>
		<tr>
			<td>ID</td>
			<td><input type="text" name="rid" value="<%= rid %>" readonly></td>
		</tr>
		<tr>
			<td>Report Id</td>
			<td><input type="text" name="reportid" value="<%= reportid %>"></td>
		</tr>
		<tr>
		<td>Title</td>
		<td><input type="text" name="title" value="<%= title %>"></td>
	</tr>
	<tr>
		<td>Content</td>
		<td><input type="text" name="content" value="<%= content %>"></td>
		</tr>
			
	</table>
	<br>
	<input type="submit" name="submit" value="Delete My Account">
	</form>
	</div>

</body>
</html>