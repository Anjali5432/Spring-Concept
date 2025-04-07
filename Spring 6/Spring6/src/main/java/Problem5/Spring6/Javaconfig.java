package Problem5.Spring6;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//This class will completely act as the XML file

@Configuration
public class Javaconfig {
	@Bean
	public Chocolate chocoer()
	{
		//creating a new Chocolate object
		Chocolate chocolate =new Chocolate();
		return chocolate;
	}
	@Bean
	public Student studer()
	{
		//creating a new Student object
		Student student=new Student(chocoer());
		return student;
	}
}