import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDAO {
	Scanner sc=new Scanner(System.in);
	private DataSource dataSource;
	public Connection con = null;
	public Statement st = null;
	public ResultSet rs = null;
	PreparedStatement ps = null;
	private JdbcTemplate jdbcTemplate;
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = (jdbcTemplate);
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void getAllEmp() {
		String query = "select * from Employee";
		List<EmployeeDetails> empList = new ArrayList<EmployeeDetails>();

		List<Map<String, Object>> empRows = jdbcTemplate.queryForList(query);

		for (Map<String, Object> empRow : empRows) {
			EmployeeDetails emp = new EmployeeDetails();
			emp.setEmpId(Integer.parseInt(String.valueOf(empRow.get("empid"))));
			emp.setEmpName(String.valueOf(empRow.get("empname")));
			emp.setEmpSal(Double.parseDouble(String.valueOf(empRow.get("empsal"))));
			emp.setEmpComm(Double.parseDouble(String.valueOf(empRow.get("empcomm"))));
			emp.setEmpDept(String.valueOf(empRow.get("empdept")));
			emp.setEmpPhone(String.valueOf(empRow.get("empphone")));
			empList.add(emp);
		}
		System.out.println(empList.toString());
	}
	
	public void getById() {
		int id;
		System.out.println("Enter EmployeeId:");
		id = sc.nextInt();
		String query = "select * from Employee where empid =" +id;
		EmployeeDetails emp = null;

		try {
			con=jdbcTemplate.getDataSource().getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			if(rs.next()) {
				emp = new EmployeeDetails();
				emp.setEmpId(rs.getInt("empid"));
				emp.setEmpName(rs.getString("empname"));
				emp.setEmpSal(rs.getDouble("empsal"));
				emp.setEmpComm(rs.getDouble("empcomm"));
				emp.setEmpDept(rs.getString("empdept"));
				emp.setEmpPhone(rs.getString("empphone"));
				System.out.println("Employee Found::" + emp);
			} else {
				System.out.println("No Employee found with id=" + id);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void getHighestSal() {

		String dept;
		System.out.println("Enter Dept:");
		dept = sc.nextLine();
		String query = "Select max(EMPSAL) from Employee where EMPDEPT like '"+dept+"' group by EMPDEPT";
		try {
			con=jdbcTemplate.getDataSource().getConnection();
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			
			
			while(rs.next())
			{
			System.out.println("Maximum salary=" + rs.getString(1));
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		} 		
	}
	
	public void removeEmpById(int id)throws SQLException
	{
		con =jdbcTemplate.getDataSource().getConnection();
		st = con.createStatement();
        rs = st.executeQuery("select * from employee");
        int f=0;
        while(rs.next())
        {
        	if(rs.getInt(1)==id)
        	{
        		f=1; 
		        String query2="Delete from employee where empid="+id;
		        ps = con.prepareStatement(query2);
			    rs = ps.executeQuery();
			    System.out.println("Removed successfully!!");
			    break;
			}		
		}
        if(f==0)
        	System.out.println("No Employee found with id="+id);
	}




	
	public void updateAddress() throws SQLException
	{
		System.out.println("Enter the employee ID which you want to update: ");
		int empNo=sc.nextInt();
		AddressDetails ob=new AddressDetails();
		con =jdbcTemplate.getDataSource().getConnection();
		st = con.createStatement();
        rs = st.executeQuery("select * from address");
        int f=0;
        while(rs.next())
        {
        	if(rs.getInt(1)==empNo)
        	{
        		f=1;
        		System.out.println("Enter the new employee State, City and PinCode:");
                String state=sc.next();
                String city=sc.next();
                String pin=sc.next();
                String query="update address set state='"+state+"',city='"+city+"',pincode='"+pin+"' where empid='"+empNo+"' ";  
                st.executeUpdate(query);
                System.out.println("Employee address updated successfully with id="+empNo);
        	}
         }
        if(f==0)
    		System.out.println("No Employee found with id="+empNo);  
     }
	
	
	public void updateCommission(int empNo,double commission) throws SQLException
	{
		
		con =jdbcTemplate.getDataSource().getConnection();
		st = con.createStatement();
        rs = st.executeQuery("select * from employee");
        int f=0;
        while(rs.next())
        {
        	if(rs.getInt(1)==empNo)
        	{
        		f=1;
        		String query="update employee set empComm='"+commission+"' where empid='"+empNo+"' ";  
                st.executeUpdate(query);
                System.out.println("Employee commission updated successfully with id="+empNo);
        	}
         }
        if(f==0)
    		System.out.println("No Employee found with id="+empNo);  
	}
	
	public int AddNewEmployee(EmployeeDetails e)
	{  
	    String query="insert into employee values('"+e.getEmpId()+"','"+e.getEmpName()+"','"+e.getEmpDept()+"','"+e.getEmpSal()+"','"+e.getEmpComm()+"','"+e.getEmpPhone()+"')";  
	    int res= jdbcTemplate.update(query); 
	    if(res!=0)
	    	System.out.println("Employee Added successfully");
	    return res;
	}


	
	
	public void updateEmpName(int empNo,String eName) throws SQLException
	{
		con =jdbcTemplate.getDataSource().getConnection();
		st = con.createStatement();
        rs = st.executeQuery("select * from employee");
        int f=0;
        while(rs.next())
        {
        	if(rs.getInt(1)==empNo)
        	{
        		f=1;
        	   String query="update employee set empName='"+eName+"' where empid='"+empNo+"' ";  
                st.executeUpdate(query);
                System.out.println("Employee name updated successfully with id="+empNo);
        	}        	        		
        }
	    if(f==0)
		System.out.println("No Employee found with id="+empNo);  
	}
	
	
	public void updateEmpPhone(int empNo,String ePhone) throws SQLException
	{
		con =jdbcTemplate.getDataSource().getConnection();
		st = con.createStatement();
        rs = st.executeQuery("select * from employee");
        int f=0;
        while(rs.next())
        {
        	if(rs.getInt(1)==empNo)
        	{
        		f=1;
        		String query="update employee set empPhone='"+ePhone+"' where empid='"+empNo+"' ";  
                st.executeUpdate(query);
                System.out.println("Employee phone number updated successfully with id="+empNo);
        	}
        }
        if(f==0)
    		System.out.println("No Employee found with id="+empNo);  
	}
	

}
