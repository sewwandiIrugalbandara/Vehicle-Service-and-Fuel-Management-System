<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" type="text/css" href="styles/useraccount.css"/>
	<meta charset="ISO-8859-1">
	<title>report account</title>
	
	<style type="text/css">
		body{
			font-family: Hind SemiBold;
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
    <br>
	<br>
	<br><br>
	<br>
	<br>

	<div class="container1">
	<table>
	<c:forEach var="report" items="${reportDetails}">
	
	<c:set var="rid" value="${report.rid}"/>
	<c:set var="reportid" value="${report.reportid}"/>
	<c:set var="title" value="${report.title}"/>
	<c:set var="content" value="${report.content}"/>

	<tr>
		<td>ID</td>
		<td>${report.rid}</td>
	</tr>
	<tr>
		<td>Report ID</td>
		<td>${report.reportid}</td>
	</tr>
	<tr>
		<td>Title</td>
		<td>${report.title}</td>
	</tr>
	<tr>
		<td>Content</td>
		<td>${report.content}</td>
	</tr>
	</c:forEach>
	</table>
	
	<c:url value="updatereport.jsp" var="rupdate">
		<c:param name="rid" value="${rid}"/>
		<c:param name="reportid" value="${reportid}"/>
		<c:param name="title" value="${title}"/>
		<c:param name="content" value="${content}"/>
	
	</c:url>
	
	</div>
	
	<div class="button-container">
	<a href="${rupdate}">
	<input type="button" name="update" value="Update My Data">
	</a>
	
	<br>
	<br>
	<br>
	<c:url value="deletereport.jsp" var="rdelete">
		<c:param name="rid" value="${rid}"/>
		<c:param name="reportid" value="${reportid}"/>
		<c:param name="title" value="${title}"/>
		<c:param name="content" value="${content}"/>
	</c:url>
	<a href="${rdelete}">
	<input type="button" name="delete" value="Delete My Account">
	</a>
	</div>
	
	
</body>
</html>