package Problem2.Spring2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Example 2- Two classes will be made as bean where class "A" will take 
//the reference of class "B"
//Here we used setter and getter methods for dependency injection
public class App {
	public static void main(String[] args) {
		System.out.println("For Config4");
		ApplicationContext context = new ClassPathXmlApplicationContext("config4.xml");
		//src\main\java\config4.xml is the real path of config4.xml file
		A aa=(A)context.getBean("aref1");   
		B bb=(B)context.getBean("bref1");
		
		//all values from class A
		System.out.println(aa);
		//all the values from class A
		System.out.println(aa.getX());
		System.out.println(aa.getB());
		//all the values from class A--->class B
		System.out.println(aa.getB().getY());
		
		//All values from class B
		System.out.println(bb);
	}
}