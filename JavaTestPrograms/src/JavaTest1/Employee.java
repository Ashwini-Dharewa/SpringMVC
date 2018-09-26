package JavaTest1;

public class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance=250.80;
	double hra=1000.50;
	Employee(long id,String name,String address,long phone)
	{
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;		
	}
	public void calculateSalary()
	{
		double salary;
		salary=basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*hra/100);
		System.out.println("Salary= "+salary);
	}
	public void calculateTransportAllowance()
	{
		double transportAllowance=(0.1*basicSalary);
		System.out.println("Transport Allowance= "+transportAllowance);
		
	}

	
	
	
	
	
	
	
	
	
	
}
