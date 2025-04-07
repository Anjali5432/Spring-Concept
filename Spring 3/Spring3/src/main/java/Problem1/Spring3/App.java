package Problem1.Spring3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Problem1.Spring3.Employee;
//Autowired using XML file
//autowired by "byType"

public class App {
	public static void main(String[] args) {
		System.out.println("For Config1");
		ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
		//src\main\java\config1.xml is the real path of config1.xml file
		Employee employee=(Employee)context.getBean("emp");   
		System.out.println(employee);
	}
}