package Problem2.Spring3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Autowired using XML file
//autowired by "byName"
public class App {
	public static void main(String[] args) 
	{
		System.out.println("For Config2");
		ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
		//src\main\java\config2.xml is the real path of config1.xml file
		Person person=(Person)context.getBean("per");   
		System.out.println(person);
	}
}
