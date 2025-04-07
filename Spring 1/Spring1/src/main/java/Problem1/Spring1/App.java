package Problem1.Spring1;
import java.util.Scanner;//Example 1- Only 1 class "Student" will be made as bean
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;


public class App {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int flag=0;
		while(true)
		{
			System.out.println("Enter your choice:");
			System.out.println("1. 1st type of Bean");
			System.out.println("2. 2nd type of Bean");
			System.out.println("3. 3rd type of Bean");
			System.out.println("4. Exit");
			int n=sc.nextInt();
			switch(n)
			{
			case 1:
				First();
				break;
			case 2:
				Second();
				break;
			case 3:
				Third();
				break;
			case 4:
				flag=1;
				break;
			default:
				System.out.println("Entered a wrong choice");
			}
			if(flag==1)
			{
				break;
			}
		}
	}
	private static void First() 
	{
		//for config1.xml
		System.out.println("For Config1");
		ApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
		//src\main\java\config1.xml is the real path of config1.xml file
		Student student1=(Student)context.getBean("stu1");   
		Student student2=(Student)context.getBean("stu2");
		//type casting done at here to "Student" Type
		//getBean("stu1") is used to achieve the bean whose name is stu1
		System.out.println(student1);
		System.out.println(student1.getStudentId());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getPhones());
		System.out.println(student1.getAddress());
		System.out.println(student1.getCourses());
		
		System.out.println(student2);
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentName());
		System.out.println(student2.getPhones());
		System.out.println(student2.getAddress());
		System.out.println(student2.getCourses());
	}
	private static void Second() 
	{
		//for config2.xml
		System.out.println("For Config2");
		ApplicationContext context = new ClassPathXmlApplicationContext("config2.xml");
		//src\main\java\config2.xml is the real path of config2.xml file
		Student student1=(Student)context.getBean("stu1");  
		Student student2=(Student)context.getBean("stu2");   
		//type casting done at here to "Student" Type
		//getBean("stu1") is used to achieve the bean whose name is stu1
		System.out.println(student1);
		System.out.println(student1.getStudentId());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getPhones());
		System.out.println(student1.getAddress());
		System.out.println(student1.getCourses());
		
		System.out.println(student2);
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentName());
		System.out.println(student2.getPhones());
		System.out.println(student2.getAddress());
		System.out.println(student2.getCourses());
	}
	private static void Third() 
	{
		//for config3.xml
		System.out.println("For Config3");
		ApplicationContext context = new ClassPathXmlApplicationContext("config3.xml");
		//src\main\java\config3.xml is the real path of config3.xml file
		Student student1=(Student)context.getBean("stu1");
		Student student2=(Student)context.getBean("stu2");
		//type casting done at here to "Student" Type
		//getBean("stu1") is used to achieve the bean whose name is stu1
		System.out.println(student1);
		System.out.println(student1.getStudentId());
		System.out.println(student1.getStudentName());
		System.out.println(student1.getPhones());
		System.out.println(student1.getAddress());
		System.out.println(student1.getCourses());
		
		System.out.println(student2);
		System.out.println(student2.getStudentId());
		System.out.println(student2.getStudentName());
		System.out.println(student2.getPhones());
		System.out.println(student2.getAddress());
		System.out.println(student2.getCourses());		
	}
}