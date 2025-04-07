package Problem1.Spring2;

public class Student {
	private double salary;

	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		System.out.println("Setting Salary");
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [salary=" + salary + "]";
	}
	//for initializing the LifeCycle
	public void init()
	{
		System.out.println("Inside init method");
	}
	//for destroying the LifeCycle
	public void destroy()
	{
		System.out.println("Inside destroy method");
	}
}