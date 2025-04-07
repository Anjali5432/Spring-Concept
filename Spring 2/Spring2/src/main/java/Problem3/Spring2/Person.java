package Problem3.Spring2;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


//Implementing InitializingBean DisposableBean Interfaces to initiate and destroy
public class Person implements InitializingBean,DisposableBean{
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Person [salary=" + salary + "]";
	}
	public void afterPropertiesSet() throws Exception
	{
		System.out.println("Taking person:init");
	}
	public void destroy() throws Exception
	{
		System.out.println("Putting person:destroy");
	}
}