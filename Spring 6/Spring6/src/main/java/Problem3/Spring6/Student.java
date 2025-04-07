package Problem3.Spring6;
import org.springframework.stereotype.Component;

@Component("firststu")
public class Student
{
	public void study()
	{
		System.out.println("Student is reading book");
	}
}