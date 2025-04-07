package Problem2.Spring5;
import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component------->>>>It will take the name of the class
@Component("stud")
public class Person {
	@Value("Anjali Kumari")      //It is used to fix the value to the variable
	private String Name;
	@Value("Kolkata")
	private String city;
	@Value("#{temp}")      //It is used to fix the value(list of values) to the variable
	private List<String> address;
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [Name=" + Name + ", city=" + city + ", address=" + address + "]";
	}
}