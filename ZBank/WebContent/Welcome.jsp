<%@ page import = "java.io.*,java.util.*" %>
<%@ page import = "javax.servlet.*,java.text.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Greetings</title>
</head>
<body>
<h1 align="center"> Z Bank - Your Perfect Bank</h1>
<%
java.util.Calendar c=new java.util.GregorianCalendar();
java.util.Date d=c.getTime();
Date dnow=new Date();
SimpleDateFormat f=new SimpleDateFormat("dd-MM-yyyy");
String dval=f.format(dnow);
int h=c.get(Calendar.HOUR_OF_DAY);
String m="";
if (h<12)
	m="Good Morning";
else
	m="Good Evening";
%>
<h3 align="right"><%
out.println(dval);
%></h3>
<h3>
<%
out.println(m);
%></h3>
<h3>
<%
out.println("Thanks for your great support");
%></h3>
<%

Integer hitsCount = (Integer)application.getAttribute("hitCounter");
if( hitsCount ==null || hitsCount == 0 ) {
   /* First visit */
   out.println("Welcome to my website!");
   hitsCount = 1;
} else {
   hitsCount += 1;
}
application.setAttribute("hitCounter", hitsCount);



%>
<h3>
<%
out.println("You are our valuable visitor number : "+hitsCount);
%></h3>




</body>
</html>