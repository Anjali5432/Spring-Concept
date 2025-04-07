package Problem1.Spring4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Problem1.Spring4.Employee;
/*
Standalone Collection
	-Standalone LinkedList
	-Standalone Vector
	-Standalone Map
	-Standalone Properties
*/

public class App {
	public static void main(String[] args) {
		System.out.println("For Config1");
		ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
		//src\main\java\config1.xml is the real path of config1.xml file
		Employee employee=(Employee)context.getBean("emp");  
		
		System.out.println(employee);
		System.out.println(employee.getFriends());
		System.out.println(employee.getFriends().getClass().getName());
		System.out.println(employee.getTeachers());
		System.out.println(employee.getTeachers().getClass().getName());
		System.out.println(employee.getFees());
		System.out.println(employee.getFees().getClass().getName());
		System.out.println(employee.getProperties());
		System.out.println(employee.getProperties().getClass().getName());	
	}
}