package Assignment3;

public class EmployeeInformation {
	int empId;
	String empName;
	String empDesig;
	double sal;
	double empComm;
	public EmployeeInformation(int i,String n,String d,double s,double c)
	{
		empId=i;
		empName=n;
		empDesig=d;
		sal=s;
		empComm=c;
	}
	public String toString()
	{
		return "Emp Id= "+empId+" ,Employee Name= "+empName+" ,Designation= "+empDesig+" ,Salary = "+sal+" ,Commission= "+empComm;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDesig() {
		return empDesig;
	}
	public void setEmpDesig(String empDesig) {
		this.empDesig = empDesig;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getEmpComm() {
		return empComm;
	}
	public void setEmpComm(double empComm) {
		this.empComm = empComm;
	}

}
