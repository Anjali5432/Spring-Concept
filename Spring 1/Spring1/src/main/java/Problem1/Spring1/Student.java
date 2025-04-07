//POJO Class
package Problem1.Spring1;
import java.util.*;
//Here we used setter method for dependency injection
//That's why we didn't make the constructor
public class Student {
	private int studentId;
	private String studentName;
	private List<String> phones;
	private Set<String> address;
	private Map<String,String> courses;
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", phones=" + phones + ", address="
				+ address + ", courses=" + courses + "]";
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
}