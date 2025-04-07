package Problem2.Spring2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//implementing LifeCycle using XML file

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("For Config2");
		ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
		//src\main\java\config2.xml is the real path of config2.xml file
		Student1 student1=(Student1)context.getBean("s2");   
		System.out.println(student1);
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}