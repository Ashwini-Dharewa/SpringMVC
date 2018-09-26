<%@page import="com.capgemini.pojo.*"%>
<%@page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">
<%String name=request.getParameter("userName");
out.println("Welcome Administrator "+name+" !!!");
%> </h2>
<h3>Select the operation which you want to perform:</h3>
<form action="/ValidatingWebPage/OperationChoice" method="post">
<input type="radio" name="operation" value="add">ADD<br>
<input type="radio" name="operation" value="delete">DELETE<br>
<input type="radio" name="operation" value="update">UPDATE<br>
<input type="radio" name="operation" value="retrieve">RETRIEVE<br><br>
<input type="submit" value="CONFIRM">
</form>
<br>
<br>
</body>
</html>