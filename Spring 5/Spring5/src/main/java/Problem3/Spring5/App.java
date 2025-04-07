package Problem3.Spring5;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Use of Configure bean scope
//Use of @Scope("") in Person class
/*
here the scope of the bean is "prototype"
so we will get the different object of a bean
for every calling
*/

public class App {
	public static void main(String[] args) {
		System.out.println("For Config3");
		ApplicationContext context = new ClassPathXmlApplicationContext("config3.xml");
		//src\main\java\config1.xml is the real path of config1.xml file
		//Student student = context.getBean("student", Student.class);
		//1st object making
		Person pers1=(Person)context.getBean("stud");  
		//"stud" name will be present in @Component("stud")
		System.out.println(pers1);
		System.out.println(pers1.hashCode());
		//2nd object making
		Person pers2=(Person)context.getBean("stud");  
		//"stud" name will be present in @Component("stud")
		System.out.println(pers2);
		System.out.println(pers2.hashCode());
	}
}