package Classfiles;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

public class OperationsDao 
{
	public Connection connection;
    public Statement statement;
    public ResultSet resultSet;
    

    public OperationsDao () {
                    try {
                        connection = ConnectionFactory.getConnection();              
                    } catch (Exception e) {
                                    e.printStackTrace();
                    }
    }
    
    public void adminAdd(String pID,String pName,float pPrice) throws SQLException
	{
    	 statement = connection.createStatement();
    	
    	String query = "INSERT INTO ITEM " +
                "VALUES ('"+pID+"','"+pName+"',"+pPrice+")";
    	
    	try {
			statement.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
    
    public String adminRetrieve(String pID) throws SQLException
   	{
       	 statement = connection.createStatement();
         resultSet = statement.executeQuery("select * from ITEM");

         while (resultSet.next()) {
                         if (resultSet.getString(1).equals(pID)) 
                         {
                           return  "ItemId = "+resultSet.getString(1)+"\n  , ItemName = "+resultSet.getString(2)+"\n  ,  ItemPrice= "+resultSet.getString(3);            
                         }
   	}
    return "Item does not exist";
   	}
    public void adminDelete(String pID) throws SQLException
    {
            statement = connection.createStatement();
           try {
                  statement.executeUpdate("DELETE FROM ITEM WHERE ITEMID ="+pID);
           } catch (SQLException e) {
                  e.printStackTrace();
           }
    }
    public void adminUpdate(String pID,String pName,double pPrice) throws SQLException
    {
            statement = connection.createStatement();
           try {
                  statement.executeUpdate("UPDATE ITEM SET ITEMNAME="+pName );
           } catch (SQLException e) {
                  e.printStackTrace();
           }
    }

}
