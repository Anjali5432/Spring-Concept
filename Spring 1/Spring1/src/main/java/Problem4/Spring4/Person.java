package Problem4.Spring4;
//Here we used constructor for dependency injection
//That's why we didn't make the getter and setter method

public class Person {
	private String name;
	private int personId;
	private Certificate certi;
	public Person(String name, int personId, Certificate certi) {
		super();
		this.name = name;
		this.personId = personId;
		this.certi = certi;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", certi=" + certi + "]";
	}
}