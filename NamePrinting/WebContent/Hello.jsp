<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>
<%
Integer hitsCount = (Integer)application.getAttribute("hitCounter");
         if( hitsCount ==null || hitsCount == 0 ) {
            /* First visit */
            out.println("Hello "+request.getParameter("userName"));
            hitsCount = 1;
         } else if(hitsCount%2==0)  {
            out.println("Hello "+request.getParameter("nickName"));
            hitsCount += 1;
         }
         else
         {
          	 out.println("Hello "+request.getParameter("userName"));
            hitsCount += 1;
         }
         application.setAttribute("hitCounter", hitsCount);
 %>
 </h3>

</body>
</html>