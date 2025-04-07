package Problem3.Spring3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Autowired using XML file
//autowired by "constructor"

public class App {
	public static void main(String[] args) {
		System.out.println("For Config3");
		ApplicationContext context = new ClassPathXmlApplicationContext("config3.xml");
		//src\main\java\config3.xml is the real path of config1.xml file
		Insaan ins=(Insaan)context.getBean("in");   
		System.out.println(ins);	
	}
}