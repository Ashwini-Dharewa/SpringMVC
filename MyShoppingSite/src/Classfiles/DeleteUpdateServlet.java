package Classfiles;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DeleteUpdateServlet")
public class DeleteUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public Connection connection;
    public Statement statement;
    public ResultSet resultSet;
    public DeleteUpdateServlet() {
        super();
       }
    protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException
    {
    	 statement = connection.createStatement();
         resultSet =(ResultSet) request.getAttribute("pTable");
         
         
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			doCommon(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		try {
			doCommon(request,response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
