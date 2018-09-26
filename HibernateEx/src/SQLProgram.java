import java.util.*; 

import org.hibernate.HibernateException; 
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.SQLQuery;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.cfg.Configuration;

public class SQLProgram {
   private static SessionFactory factory; 
   private static Transaction tx;
   private static  Session session;
   public SQLProgram()
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
      
      SQLProgram ME = new SQLProgram();

      /* Add few employee records in database */
      Integer empID1 = ME.addEmployee("Zara", "Ali", 2000);
      Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
      Integer empID3 = ME.addEmployee("John", "Paul", 5000);
      Integer empID4 = ME.addEmployee("Mohd", "Yasee", 3000);

      /* List down complete employees information using Entity Query */
      ME.listEmployeesEntity();
      System.out.println("After update: ");
      ME.updateEmployeesEntity("Ashwini",2000);
      ME.listEmployeesEntity();
   }
   
   /* Method to CREATE an employee in the database */
   public Integer addEmployee(String fname, String lname, int salary){
      Session session = factory.openSession();
      Transaction tx = null;
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

   /* Method to READ all the employees using Entity Query */
   public void listEmployeesEntity( ){
     
      
      try {
         tx = session.beginTransaction();
         String sql = "SELECT * FROM EMPLOYEE2";
         SQLQuery query = session.createSQLQuery(sql);
         query.addEntity(Employee.class);
         List employees = query.list();

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
   
  /* Session session = factory.openSession();
   Transaction tx = null;
   
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
   try {
       tx = session.beginTransaction();
       String sql = "SELECT * FROM EMPLOYEE2";
       SQLQuery query = session.createSQLQuery(sql);
       query.addEntity(Employee.class);
       List employees = query.list();

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
 }*/
  /* String hql = "UPDATE Employee set salary = :salary "  + 
           "WHERE id = :employee_id";
Query query = session.createQuery(hql);
query.setParameter("salary", 1000);
query.setParameter("employee_id", 10);
int result = query.executeUpdate();
System.out.println("Rows affected: " + result);*/
   
   
   public void updateEmployeesEntity(String fname,int id){
	   
	   session = factory.openSession();
	   tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         String sql = "update employee2 set firstName='"+fname+"' where id='"+id+"' "; ;
	         SQLQuery query = session.createSQLQuery(sql);
	         query.setParameter("firstName", "Ashwini");
	         query.setParameter("id", 5000);
	         int result = query.executeUpdate();
	         System.out.println("Rows affected: " + result);

	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   
	   
   }
}
