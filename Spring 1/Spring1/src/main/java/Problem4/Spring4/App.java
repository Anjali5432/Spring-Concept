package Problem4.Spring4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Problem3.Spring3.Student1;
//Example 4- Two classes will be made as bean where class "Person" will take 
//the reference of class "Certificate"

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config6.xml");
		//src\main\java\config6.xml is the real path of config6.xml file
		Person peri=(Person)context.getBean("per");     
		System.out.println(peri);
	}
}