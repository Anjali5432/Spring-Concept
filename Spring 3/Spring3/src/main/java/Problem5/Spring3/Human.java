package Problem5.Spring3;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {
	@Autowired
	@Qualifier("area2")
	//@Qualifier("name_of_certain_bean") helps to select the certain bean
	private Area area;
	public Area getArea() {
		return area;
	}
	public void setArea(Area area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Human [area=" + area + "]";
	}
}