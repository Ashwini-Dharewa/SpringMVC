package com.capgemini.pojo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RetrieveServlet")
public class RetrieveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RetrieveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
    	 AdminDao operationType=new AdminDao();
    	 RequestDispatcher requestDispatcher;
    	 String productID=(String)request.getParameter("productId");
    	 String TextValue=operationType.adminRetrieve(productID);
    	 request.setAttribute("TextValue",TextValue);
    	 requestDispatcher=request.getRequestDispatcher("/OperationProcessing.jsp");
    	 requestDispatcher.forward(request, response);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request,response);
	}

}