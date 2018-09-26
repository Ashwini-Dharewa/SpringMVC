package com.capgemini.pojo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/OperationChoice")
public class OperationChoice extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public OperationChoice() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	String operation=request.getParameter("operation");
    	if(operation.equals("add"))
    	{
    		RequestDispatcher requestDispatcher=request.getRequestDispatcher("/Adding.jsp");
    		requestDispatcher.forward(request, response);
    	}
    	else if(operation.equals("retrieve"))
    	{
    		RequestDispatcher requestDispatcher=request.getRequestDispatcher("/RetrieveData.jsp");
    		requestDispatcher.forward(request, response);
    	}
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doCommon(request,response);
	}

}
