package Problem4.Spring5;
import java.beans.Expression;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;
//Spring Expression Language 
//Use of @Value("#{Expression}")
/*Invoke static method and variable:
  	-@Value("#{T(class).method(parameter)}")
  	-@Value("#{T(class).variable}")
 */
//Use of @Value("#{new object(value)}")

public class App {
	public static void main(String[] args){
		System.out.println("For Config4");
		ApplicationContext context = new ClassPathXmlApplicationContext("config4.xml");
		//src\main\java\config1.xml is the real path of config1.xml file
		//People peo1 = context.getBean("peop", People.class);
		People peo1=(People)context.getBean("peop");  
		//"peop" name will be present in @Component("peop")
		System.out.println(peo1);	
	}
}
