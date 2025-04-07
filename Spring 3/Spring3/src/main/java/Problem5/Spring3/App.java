package Problem5.Spring3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Problem4.Spring3.Aadmi;
//Use of @Qualifier 

public class App {
	public static void main(String[] args) {
		System.out.println("For Config5");
		ApplicationContext context = new ClassPathXmlApplicationContext("config5.xml");
		//src\main\java\config5.xml is the real path of config1.xml file
		Human hu=(Human)context.getBean("humn");   
		System.out.println(hu);
	}
}