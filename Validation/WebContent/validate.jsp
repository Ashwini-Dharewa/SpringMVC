<%@page import="details.AdminDetails"%>
<%@page import="details.UserDetails"%>
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
<%
String name=request.getParameter("userName");
String pw=request.getParameter("pswd");
String t=request.getParameter("type");

int f=0;
if(t.equals("admin")){
	ArrayList<AdminDetails> a=new ArrayList<AdminDetails>();
	a.add(new AdminDetails("Ashwini","ash@123","admin"));
	a.add(new AdminDetails("Swagata","swag@987","admin"));
for(int i=0;i<a.size();i++)
{
	if(name.equals(a.get(i).getN())){
		if(pw.equals(a.get(i).getP())){
			RequestDispatcher r=request.getRequestDispatcher("/admin.jsp");
			r.forward(request,response);
			f=1;
			break;
		}		
		else
			out.print("Password wrong!");
	}	
}
if(f==0)
	out.print("Username wrong!");
}

else
{
	ArrayList<UserDetails> u=new ArrayList<UserDetails>();
	u.add(new UserDetails("Angshuman","ab12","user"));
	u.add(new UserDetails("Abhrak","ac12","user"));
	u.add(new UserDetails("Tanusree","tr12","user"));
	u.add(new UserDetails("Riya","rr12","user"));
	for(int i=0;i<u.size();i++)
	{
		if(name.equals(u.get(i).getUsername())){
			if(pw.equals(u.get(i).getPassword())){
				RequestDispatcher r=request.getRequestDispatcher("/user.jsp");
				r.forward(request,response);
				
			}		
			else{
				out.print("Password wrong!");
				f=1;
				break;
			}
		}	
	}
	if(f==0)
		out.print("Username wrong!");
}


		
	
%>

</body>
</html>