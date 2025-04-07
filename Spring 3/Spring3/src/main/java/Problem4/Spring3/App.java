package Problem4.Spring3;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Problem5.Spring3.Human;

//Autowired using annotation
/*
 @Autowired can be written over--
    -name of the variable of Pata class in Aadmi class
    -the setter method
    -the constructor
*/
public class App {
	public static void main(String[] args) {
		System.out.println("For Config4");
		ApplicationContext context = new ClassPathXmlApplicationContext("config4.xml");
		//src\main\java\config4.xml is the real path of config1.xml file
		Aadmi aad=(Aadmi)context.getBean("aadm");   
		System.out.println(aad);
		}
}