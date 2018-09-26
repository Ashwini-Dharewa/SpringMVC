package Assignment1;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.function.ToDoubleFunction;

public class EmployeeRepository {

	private static ArrayList<Employee> a;
	
	static {
		add();
	}
	private static void add()
	{
		Employee ob[]=new Employee[3];
		Department d[]=new Department[3];
		/*d[0].departmentId=10;
		d[0].departmentName="Cse";
		d[0].managerId=456;
		
		d[1].departmentId=11;
		d[1].departmentName="Ece";
		d[1].managerId=567;
		
		d[2].departmentId=12;
		d[2].departmentName="EE";
		d[2].managerId=678;*/
		d[0]=new Department(10,"Cse",456);
		d[1]=new Department(11,"Ece",567);
		d[2]=new Department(12,"EE",678);
		
		LocalDate d1=LocalDate.of(2018,Month.JULY,11);
		LocalDate d2=LocalDate.of(2018,Month.JULY,11);
		LocalDate d3=LocalDate.of(2018,Month.JULY,11);
		a=new ArrayList<Employee>();
		ob[0]=new Employee(1,"Ash","Dh","ad.1","123",d1,"Manager",34568,456,d[0]);
		ob[1]=new Employee(2,"Swa","Kun","sk.2","673",d2,"Employee",8978,567,d[2]);
		ob[2]=new Employee(3,"Tan","Roy","tr.3","905",d3,"A4",6910,678,d[2]);
		
		a.add(ob[0]);
		a.add(ob[1]);
		a.add(ob[2]);
	}
	public static ArrayList<Employee> getList() {
		return a;
	}
	public static double getSalary() {
		return Employee.getSalary();
	}

}
