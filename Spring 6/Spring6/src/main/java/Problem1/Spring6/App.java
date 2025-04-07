package Problem1.Spring6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Use of XML for little bit
//Showing an example for further examples to remove the XML file completely

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
		Student student = context.getBean("firststu",Student.class);
		System.out.println(student);
	}
}