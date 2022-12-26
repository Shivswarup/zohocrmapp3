<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Compose Email</title>
</head>
<body>
    <h1>Compose Email</h1>
    <h2>${msg}</h2>
    <form action="sendEmail" action="post">
    	<pre>
    	    To<input type="text" name="to" value="${email}"/>
    	    Subject<input type="text" name="sub"/>
    	   <textarea name="msg" rows="4" cols="50">
    	     
    	   </textarea>
    	   <input type="submit" value="send" />
    	</pre>
    </form>
</body>
</html>