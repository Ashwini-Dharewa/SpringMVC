<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
<h4 align="right">
<%
Integer hitsCount = (Integer)application.getAttribute("hitCounter");
         if( hitsCount ==null || hitsCount == 0 ) {
            hitsCount = 1;
         }  
         else
         {
          	 hitsCount += 1;
         }
         application.setAttribute("hitCounter", hitsCount);
         out.println("Visitor Count: "+hitsCount);
 %>
</h4>
<h1 align="center">EBazaar</h1><br><br>
<a href="Mobile.jsp">Mobiles</a><br>
<a href="Watch.jsp">Watches</a><br>
<a href="Laptop.jsp">Laptops</a><br>

</body>
</html>