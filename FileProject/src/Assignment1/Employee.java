package Assignment1;

import java.time.LocalDate;

public class Employee {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	String phoneNumber;
	LocalDate hireDate;
	String designation;
	static double salary;
	int managerId;
	Department department;
	public Employee()
	{
		
	}
	public Employee(int i,String f,String l,String e,String p,LocalDate date,String d,double s,int m,Department dept)
	{
		employeeId=i;
		firstName=f;
		lastName=l;
		email=e;
		phoneNumber=p;
		hireDate=date;
		designation=d;
		salary=s;
		managerId=m;
		department=dept;
		
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public static double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

}
