package Problem3.Spring2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Problem1.Spring2.Student;

//implementing LifeCycle using interface
public class App {
	public static void main(String args[])
	{
		System.out.println("For Config3");
		ApplicationContext context = new ClassPathXmlApplicationContext("config3.xml");
		//src\main\java\config3.xml is the real path of config3.xml file
		Person per=(Person)context.getBean("s3");   
		System.out.println(per);
		((AbstractApplicationContext) context).registerShutdownHook();
	}
}