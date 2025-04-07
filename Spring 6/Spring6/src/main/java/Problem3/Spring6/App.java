package Problem3.Spring6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Problem3.Spring6.Javaconfig;
import Problem3.Spring6.Student;
//Replacing the XML file with the Javaconfig.java class and entiy class(Student.java)
//Example-2

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
		Student student = context.getBean("firststu",Student.class);
		System.out.println(student);
		student.study();
	}
}