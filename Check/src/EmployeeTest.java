import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class EmployeeTest {

               public static void main(String[] args) {

                              BeanFactory beanFact=new XmlBeanFactory(new ClassPathResource("context.xml"));

                              Employee employee=(Employee)beanFact.getBean("employeeObj");

                              System.out.println(employee);
                              
               }
}
