<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Lead</title>
</head>
<body>
<h1>Create Lead</h1>
    <form action="saveLead" method="post" > 
	  <pre>
	  	FirstName:<input type="text" name="FirstName">
	  	LastName:<input type="text" name="LastName">
	  	Email:<input type="email" name="email">
	  	Mobile:<input type="text" name="mobile">
	  	Source:
	  	<select name="source" >
		  <option value="news paper">news paper</option>
		  <option value="online">Online</option>
		  <option value="webinar">Webinar</option>
		  <option value="radio">Radio</option>
		</select>
	  	 <input type="submit" value="Submit">
	  	
	  </pre>
`	</form> 
</body>
</html>