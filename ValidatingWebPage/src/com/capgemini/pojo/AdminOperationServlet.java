package com.capgemini.pojo;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/AdminOperationServlet")
public class AdminOperationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
     public AdminOperationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
     protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
     {
    	 AdminDao operationType=new AdminDao();
    	 RequestDispatcher requestDispatcher;
    	 String productID=request.getParameter("productID");
    	 String productName=request.getParameter("productName");
    	 double productPrice=Double.parseDouble(request.getParameter("productPrice"));
    	 operationType.adminAdd(productID,productName,productPrice);
    	 String TextValue="Addition done successfully";
    	 request.setAttribute("TextValue",TextValue);
    	 requestDispatcher=request.getRequestDispatcher("/OperationProcessing.jsp");
    	 requestDispatcher.forward(request, response);
    	// }
    	/* else if(operation.equals("delete"))
    	 {
    		int i=operationType.adminDelete("c1");
    		String TextValue="";
    		if(i==1)
    			TextValue="Deletion done successfully";
    		else
    			TextValue="Element not found!!";
    		request.setAttribute("TextValue",TextValue);
    		requestDispatcher=request.getRequestDispatcher("/OperationProcessing.jsp");
    		requestDispatcher.forward(request, response);
    	 }
    	 else if(operation.equals("retrieve"))
    	 {
    		 String TextValue=operationType.adminRetrieve("h1");
    		request.setAttribute("TextValue",TextValue);
    		requestDispatcher=request.getRequestDispatcher("/OperationProcessing.jsp");
    		requestDispatcher.forward(request, response);
    	 }*/
    	 
     }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request,response);
	}

}
