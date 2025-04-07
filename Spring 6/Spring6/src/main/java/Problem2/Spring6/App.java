package Problem2.Spring6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//Replacing the XML file with the Javaconfig.java class and entiy class(Student.java)
//Example-1

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
		Student student = context.getBean("firststu",Student.class);
		System.out.println(student);										
	}
}