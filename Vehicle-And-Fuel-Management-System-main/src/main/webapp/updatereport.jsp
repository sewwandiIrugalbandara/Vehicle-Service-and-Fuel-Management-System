<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="styles/updateu.css"/>
	<meta charset="UTF-8">
	<title>Update report</title>
	<style type="text/css">
		table {
  			border-collapse: collapse;
		}

		table, th, td {
		  border: 1px solid black;
		}
	</style>
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
	
	<div class="container1">
	<form action="updatereport" method="post">
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
	<input type="submit" name="submit" value="Update My Data">
	</form>
	</div>

</body>
</html>