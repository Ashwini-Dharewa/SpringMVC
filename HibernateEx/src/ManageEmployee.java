import java.util.List; 
import java.util.Date;
import java.util.Iterator; 
 






import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ManageEmployee {
   private static SessionFactory factory; 
   private static Transaction tx;
   private static  Session session;
   public ManageEmployee()
   {
	   session = factory.openSession();
	   tx = null;
   }
   public static void main(String[] args) {
      
      try {
         factory = new Configuration().configure().buildSessionFactory();
      } catch (Throwable ex) { 
         System.err.println("Failed to create sessionFactory object." + ex);
         throw new ExceptionInInitializerError(ex); 
      }
      
      ManageEmployee ME = new ManageEmployee();

      /* Add few employee records in database */
      Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
      Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
      Integer empID3 = ME.addEmployee("John", "Paul", 10000);

      /* List down all the employees */
      ME.listEmployees();
       System.out.println("After updating and deleting:");
      /* Update employee's records */
      ME.updateEmployee(empID1, 5000);
      /* Delete an employee from the database */
      ME.deleteEmployee(empID2);

      /* List down new list of the employees */
      ME.listEmployees();
      
      System.out.println("Using criteria queries:");
      ME.listEmployeesCri();
      System.out.println("After deleting:");
      ME.criDel(empID1);
      System.out.println("After updating: ");
      ME.criUpdate(empID2,"Ashwini","Dharewa",3456);
      ME.listEmployeesCri();
      
   }
   
   /* Method to CREATE an employee in the database */
   public Integer addEmployee(String fname, String lname, int salary){
     session = factory.openSession();
     Integer employeeID = null;
      
      try {
         tx = session.beginTransaction();
         Employee employee = new Employee(fname, lname, salary);
         employeeID = (Integer) session.save(employee); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
      return employeeID;
   }
   
   /* Method to  READ all the employees */
   public void listEmployees( ){
      session = factory.openSession();
      try {
         tx = session.beginTransaction();
         List employees = session.createQuery("FROM Employee").list(); 
         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
            Employee employee = (Employee) iterator.next(); 
            System.out.print("First Name: " + employee.getFirstName()); 
            System.out.print("  Last Name: " + employee.getLastName()); 
            System.out.println("  Salary: " + employee.getSalary()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to UPDATE salary for an employee */
   public void updateEmployee(Integer EmployeeID, int salary ){
     session = factory.openSession();
      //Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
         employee.setSalary( salary );
		 session.update(employee); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   
   /* Method to DELETE an employee from the records */
   public void deleteEmployee(Integer EmployeeID){
     session = factory.openSession();
      //Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
         session.delete(employee); 
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   @SuppressWarnings("deprecation")
public void listEmployeesCri( ) {
     session = factory.openSession();
     // Transaction tx = null;
      
      try {
         tx = session.beginTransaction();
         Criteria cr = session.createCriteria(Employee.class);
         // Add restriction salary>2000
         cr.add(Restrictions.gt("salary", 2000));
         List employees = cr.list();

         for (Iterator iterator = employees.iterator(); iterator.hasNext();){
            Employee employee = (Employee) iterator.next(); 
            System.out.print("First Name: " + employee.getFirstName()); 
            System.out.print("  Last Name: " + employee.getLastName()); 
            System.out.println("  Salary: " + employee.getSalary()); 
         }
         tx.commit();
      } catch (HibernateException e) {
         if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      } finally {
         session.close(); 
      }
   }
   public void criDel(Integer empID1)
   {
	   session = factory.openSession();
	   try
	   {
		   tx = session.beginTransaction();
		   Employee emp = (Employee ) session.createCriteria(Employee.class)
	               .add(Restrictions.eq("id", empID1)).uniqueResult();
	   session.delete(emp);
	   tx.commit();
	   }
	   catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
         
		
   }
   
   
   public void criUpdate(Integer empID1,String fname,String lname,int salary)
   {
	   session = factory.openSession();
	   try
	   {
		   tx = session.beginTransaction();
		   Employee emp = (Employee ) session.createCriteria(Employee.class)
	               .add(Restrictions.eq("id", empID1)).uniqueResult();
	   session.delete(emp);
	   Employee employee = new Employee(fname, lname, salary);
       session.save(employee); 
	   tx.commit();
	   }
	   catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
         
		
   }
   
   
  

}

