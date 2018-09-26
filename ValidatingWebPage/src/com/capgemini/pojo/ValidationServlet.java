package com.capgemini.pojo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidationServlet")
public class ValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     public ValidationServlet() {
        super();
       }
     
     protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, InvalidUserException
     {
    	 String userName=request.getParameter("userName");
    	 String password=request.getParameter("password");
    	 UserDao dao=new UserDao();
    	 String userType=dao.getUserType(userName, password);
    	 RequestDispatcher requestDispatcher;
    	 if(userType.equals("Admin"))
    	 {
    		 requestDispatcher=request.getRequestDispatcher("/admin.jsp");
    	 }
    	 else if(userType.equals("User"))
    	 {
    		 requestDispatcher=request.getRequestDispatcher("/user.jsp");
    	 }
    	 else
    	 {
    		 requestDispatcher=request.getRequestDispatcher("/invalidUser.jsp");
    	 }
    	 requestDispatcher.forward(request, response);
    	 
     }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doCommon(request,response);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doCommon(request,response);
		} catch (InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
