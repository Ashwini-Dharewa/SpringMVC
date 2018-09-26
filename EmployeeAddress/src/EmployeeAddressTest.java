import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class EmployeeAddressTest {

	public static void main(String[] args) throws SQLException {
		Scanner sc=new Scanner(System.in);
		System.out.println("hdjfrgjtfrgf");
		ApplicationContext ctx=new ClassPathXmlApplicationContext("context.xml");  
		EmpDAO ob=(EmpDAO)ctx.getBean("employeeObj");

        System.out.println("Select the operation which you want to perform: ");
        System.out.println("1.Get all Employees.\n2.Get Employee by Employee ID.\n3.Get the highest Salary."
        		+ "\n4.Update Commission.\n5.Add new Employee.\n6.Remove Employee by Employee ID."
        		+ "\n7.Update Employee Name.\n8.Update Employee Phone Number.\n9.Update Employee Address.");
        System.out.println("Enter your choice:");
        int n=sc.nextInt();
        switch(n)
        {
        case 1:ob.getAllEmp();
               break;
        case 2:ob.getById();
               break;
        case 3:ob.getHighestSal();
               break;
        case 4:System.out.println("Enter the employee ID and the new commission value: ");
        	   int eId=sc.nextInt();
        	   double comm=sc.nextDouble();
        	   ob.updateCommission(eId,comm);
        	   break;        	   
        case 5:System.out.println("Enter the id,name,department,salary,commission and phone number of the employee one by one :");
                int eid=sc.nextInt();
                String nm=sc.next();
                String d=sc.next();
                double sal=sc.nextDouble();
                double com=sc.nextDouble();
                String pn=sc.next();
                EmployeeDetails ob2=new EmployeeDetails(eid,nm,d,sal,com,pn);
                int result=ob.AddNewEmployee(ob2);
                if(result==0)
                	System.out.println("Addition was not performed succesfully!!");
                break;
        case 6:System.out.println("Enter the Id of the employee to be removed");
               int number=sc.nextInt();
        	   ob.removeEmpById(number);
               break;
        case 7:System.out.println("Enter the employee ID and the new Employee name : ");
 	   			int eId2=sc.nextInt();
 	   			String name=sc.next();
 	   			ob.updateEmpName(eId2,name);
 	   			break;
        case 8:System.out.println("Enter the employee ID and the new Employee phone number : ");
			   int eId1=sc.nextInt();
			   String phNo=sc.next();
			   ob.updateEmpPhone(eId1,phNo);
			   break;
        case 9:ob.updateAddress();
               break;
        default:System.out.println("You have entered a wrong choice!!");
        }


	}

}
