package Problem4.Spring6;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//This class will completely act as the XML file

@Configuration
@ComponentScan(basePackages="Problem4/Spring6")   //you can remove this line also
public class Javaconfig {
	//here the name of the bean is studer,studer1,studer2,studer3
	@Bean(name= {"studer1","studer2","studer3"})
	public Student studer()
	{
		//creating a new student object
		Student student=new Student();
		return student;
	}
/*
   //here the name of the bean is studer
	@Bean
	public Student studer()
	{
		//creating a new student object
		Student student=new Student();
		return student;
	}
*/
}