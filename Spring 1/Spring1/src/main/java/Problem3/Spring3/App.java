package Problem3.Spring3;
import java.util.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import Problem1.Spring1.Student;
//Example 3- Only 1 class "Student1" will be made as bean

public class App {
	public static void main(String args[])
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("config5.xml");
		//src\main\java\config5.xml is the real path of config5.xml file
		Student1 student1=(Student1)context.getBean("stud");     
		System.out.println(student1);
	}
}