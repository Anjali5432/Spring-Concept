package Problem2.Spring2;

public class Student1 {
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
	//Here we changed the name of the init() method and destroy() method
	//for initializing the LifeCycle
	public void hey()
	{
		System.out.println("Inside init method-->hey() method");
	}
	//for destroying the LifeCycle
	public void bye()
	{
		System.out.println("Inside destroy method-->bye method");
	}	
}
