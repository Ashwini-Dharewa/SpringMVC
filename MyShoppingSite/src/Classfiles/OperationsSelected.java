package Classfiles;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OperationsSelected")
public class OperationsSelected extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public OperationsSelected() {
        super();
        
    }
    protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String selected = request.getParameter("operation");
        RequestDispatcher rd = null;
        if(selected.equals("add"))
        	rd = request.getRequestDispatcher("/jspFiles/Adding.jsp");
        else if(selected.equals("delete"))
        	rd = request.getRequestDispatcher("/jspFiles/DeleteUpdate.jsp");
        else if(selected.equals("update"))
        	rd = request.getRequestDispatcher("/jspFiles/DeleteUpdate.jsp");
        else if(selected.equals("retrieve"))
        	rd = request.getRequestDispatcher("/jspFiles/RetrieveData.jsp");
        rd.forward(request,response);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			doCommon(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			doCommon(request,response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
