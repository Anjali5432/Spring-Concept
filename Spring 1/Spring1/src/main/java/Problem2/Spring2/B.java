package Problem2.Spring2;
//Here we used setter method for dependency injection
//That's why we didn't make the constructor
public class B {
	private int y;
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "B [y=" + y + "]";
	}
}