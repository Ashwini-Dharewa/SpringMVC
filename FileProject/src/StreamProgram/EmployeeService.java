package StreamProgram;

import java.util.*;
import java.util.stream.Collectors;
public class EmployeeService {

	public static void main(String[] args) {
		double sum=EmployeeRepository.getEmployees().stream().mapToDouble(obj->obj.getSalary()).sum();
		System.out.println("Sum of Salary amount="+sum);
		
		int i=1;
		Map<Object, List<Employee>> empCount = EmployeeRepository.getEmployees().stream().collect(Collectors.groupingBy((employee)->employee.getDepartment()));
		for(Object emp:empCount.keySet()) {
			System.out.println("No. of employees in department "+i+" = "+empCount.get(emp).size());
			i++;
		}
		
				
		
	}

}
