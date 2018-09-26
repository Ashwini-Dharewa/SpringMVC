<%@ page import = "java.io.*,java.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
<a href="Home.jsp">Home</a>
<a href="Cart.jsp">View Cart</a><br>
<%
TreeMap<String,Integer> t=new TreeMap<String,Integer>();
t.put("Samsung",25000);
t.put("Nokia",15000);
t.put("LG",5000);
Map.Entry s=t.entrySet();
%>

<form>
<input type="checkbox" name="id" value="t1"> <%out.print(s.getKey()); %>
<input type="checkbox" name="id" value=".NET"> .NET<BR>
<input type="checkbox" name="id" value="PHP"> PHP<BR>
<input type="checkbox" name="id" value="C/C++"> C/C++<BR>
<input type="checkbox" name="id" value="PERL"> PERL <BR>
<input type="submit" value="Submit">
</form>
<%

String select[] = request.getParameterValues("id"); 
if (select != null && select.length != 0) {
out.println("You have selected: ");
for (int i = 0; i < select.length; i++) {
out.println(select[i]); 
}
}
%>



</body>
</html>