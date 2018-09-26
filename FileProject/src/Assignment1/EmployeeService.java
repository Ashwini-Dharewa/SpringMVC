package Assignment1;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class EmployeeService {

	public static void main(String[] args) {
		EmployeeRepository ob1=new EmployeeRepository();
		
		Department d1=new Department(10,"Cse",456);
		Department d2=new Department(11,"Ece",567);
		Department d3=new Department(12,"EE",678);
		
		LocalDate dt1=LocalDate.of(2018,Month.JULY,11);
		LocalDate dt2=LocalDate.of(2018,Month.JULY,11);
		LocalDate dt3=LocalDate.of(2018,Month.JULY,11);
		ArrayList<Employee>a=new ArrayList<Employee>();
		Employee o1=new Employee(1,"Ash","Dh","ad.1","123",dt1,"Manager",34568,456,d1);
		Employee o2=new Employee(2,"Swa","Kun","sk.2","673",dt2,"Employee",8978,567,d2);
		Employee o3=new Employee(3,"Tan","Roy","tr.3","905",dt3,"A4",6910,678,d3);
		
		
		//Double s=EmployeeRepository.getList().stream().mapToDouble(ob1.getSalary()).sum();
		//double s=(double) EmployeeRepository.getList().stream().collect((f) -> Employee.getSalary.sum());
		//System.out.println("Sum= "+s);
		List<Employee> x = new ArrayList<>(Arrays.asList(o1,o2,o3));
		Double s=x.stream().mapToDouble(Employee::getSalary()).sum();
		
		Map<Object, List<Employee>> empCount = EmployeeRepository.getList().stream().collect(Collectors.groupingBy((employee)->employee.getDepartment()));
		for(Object emp:empCount.keySet()) {
			System.out.println(emp+" ; No. of employees= "+empCount.get(emp).size());
		}
		
		Map<Object, List<Employee>> empCount = EmployeeRepository.getList().stream().collect(Collectors.groupingBy((employee)->employee.getDepartment()));
		for(Object emp:empCount.keySet()) {
			System.out.println(emp+" ; No. of employees= "+empCount.get(emp).size());
		}
		
		
		
		
		
	}

	private static Object getSalary() {
		// TODO Auto-generated method stub
		return null;
	}

}
