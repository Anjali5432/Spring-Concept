package Problem1.Spring4;
import java.util.*;

public class Employee {
	private List<String> friends;
	private List<String> teachers;
	private Map<String,Integer> fees;
	private Properties properties;
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public Map<String, Integer> getFees() {
		return fees;
	}
	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}
	public List<String> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<String> teachers) {
		this.teachers = teachers;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	@Override
	public String toString() {
		return "Employee [friends=" + friends + ", teachers=" + teachers + ", fees=" + fees + ", properties="
				+ properties + "]";
	}
}