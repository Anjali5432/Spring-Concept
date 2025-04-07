package Problem3.Spring3;
import java.util.*;

//Here we used constructor for dependency injection
//That's why we didn't make the getter and setter method
public class Student1 {
	private int studentId;
	private String studentName;
	private List<String> phones;
	private Set<String> address;
	//private Map<String,String> courses;
	
	public Student1(int studentId, String studentName, List<String> phones, Set<String> address) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.phones = phones;
		this.address = address;
		//this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student1 [studentId=" + studentId + ", studentName=" + studentName +
				", phones=" + phones + ", address="+ address + "]";
	}	
}