package Problem4.Spring2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Problem3.Spring2.Person;

//implementing LifeCycle using annotation
public class App {

	public static void main(String[] args) {
		System.out.println("For Config4");
		ApplicationContext context = new ClassPathXmlApplicationContext("config4.xml");//src\main\java\config1.xml is the real path of config1.xml file
		People peo=(People)context.getBean("s4");   
		System.out.println(peo);
		((AbstractApplicationContext) context).registerShutdownHook();

	}

}
