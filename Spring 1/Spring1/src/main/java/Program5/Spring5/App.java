package Program5.Spring5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Problem4.Spring4.Person;
//Example 5- Only 1 class "Addition" will be made as bean
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config7.xml");
		//src\main\java\config7.xml is the real path of config7.xml file
		Addition adder=(Addition)context.getBean("add");     
		System.out.println(adder);
		adder.addFunction();	
	}
}