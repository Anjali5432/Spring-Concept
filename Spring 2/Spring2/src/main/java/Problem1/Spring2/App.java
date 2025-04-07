package Problem1.Spring2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//implementing LifeCycle using XML file

public class App {
	public static void main(String[] args) {
		System.out.println("For Config1");
		ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
		//src\main\java\config1.xml is the real path of config1.xml file
		Student student1=(Student)context.getBean("s1");   
		System.out.println(student1);
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}