package Problem4.Spring6;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Problem4.Spring6.Javaconfig;
import Problem4.Spring6.Student;
//Replacing the XML file with the Javaconfig.java class
//here we tried to make one bean

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Javaconfig.class);
		//Student student = context.getBean("studer",Student.class);
		Student student = context.getBean("studer1",Student.class);
		//Student student = context.getBean("studer2",Student.class);
		//Student student = context.getBean("studer3",Student.class);
		
		System.out.println(student);
		student.study();
	}
}