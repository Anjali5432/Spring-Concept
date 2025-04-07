package Problem1.Spring6;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("firststu")
public class Student {
	@Value("10000")
	private int salary;
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [salary=" + salary + "]";
	}
}