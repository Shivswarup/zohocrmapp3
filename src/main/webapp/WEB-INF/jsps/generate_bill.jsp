<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing</title>
</head>
<body>
		<h1>Billing</h1>
    <form action="saveBill" method="post" > 
	  <pre>
	  	FirstName:<input type="text" name="FirstName" value="${contact.firstName }"/>
	  	LastName:<input type="text" name="LastName" value="${contact.lastName }">
	  	Email:<input type="email" name="email" value="${contact.email}">
	  	Mobile:<input type="text" name="mobile" value="${contact.mobile}">
	  	Product:<input type="text" name="product" >
	  	Quantity:<input type="text" name="quantity" >
	  	Amount:<input type="text" name="amount" >
	  	 <input type="submit" value="Submit">
	  	
	  </pre>
`	</form> 
</body>
</html>