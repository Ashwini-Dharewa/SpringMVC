package Assignment1;

public class Department {
	int departmentId;
	String departmentName;
	int managerId;
	public Department(int i,String d,int m)
	{
		departmentId=i;
		departmentName=d;
		managerId=m;
	}
	public String toString()
	{
		return "Department details: DeptId: "+departmentId+" ,Name: "+departmentName+" , Manager Id: "+managerId;
	}

}
