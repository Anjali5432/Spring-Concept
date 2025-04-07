package Problem1.Spring5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Use of @Component and @value

public class App {
	public static void main(String[] args) {
		System.out.println("For Config1");
		ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
		//src\main\java\config1.xml is the real path of config1.xml file
		//Student student = context.getBean("student", Student.class);
		Student student=(Student)context.getBean("stud"); 
		//"stud" name will be present in @Component("stud")
		System.out.println(student);
	}
}