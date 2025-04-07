package Problem2.Spring3;

public class Person {
	private Location location1;
	public Location getLocation1() {
		return location1;
	}
	public void setLocation1(Location location1) {
		this.location1 = location1;
	}
	@Override
	public String toString() {
		return "Person [location1=" + location1 + "]";
	}
/*
	private Location location2;
	public Location getLocation2() {
		return location2;
	}
	public void setLocation2(Location location2) {
		this.location2 = location2;
	}
	@Override
	public String toString() {
		return "Person [location2=" + location2 + "]";
	}
*/
}
	
