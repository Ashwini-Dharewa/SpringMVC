<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Enter the Product Id which you want to retrieve</h1>
<br><br>
<h3 align="center">
<form action="/MyShoppingSite/RetrieveServlet" method="post">
Product Id:<input type="text" name="productID"><br><br><br>
<input type="submit" value="Confirm">
</form>
</h3>

</body>
</html>


