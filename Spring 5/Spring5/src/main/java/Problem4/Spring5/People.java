package Problem4.Spring5;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("peop")
public class People {
	@Value("#{22+11}")
	private int x;
	@Value("#{8>6?88:55}")
	private int y;
	//@Value("#{T(class).method(parameter)}")
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private int z;
	//@Value("#{T(class).variable}")
	@Value("#{T(java.lang.Math).PI}")
	private int a;
	
	private int b;
	@Value("#{new java.lang.String('Anjali Kumari')}")
	private String c;
	@Value("#{8>3}")
	private boolean d;
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public String getC() {
		return c;
	}

	public void setC(String c) {
		this.c = c;
	}

	public boolean isD() {
		return d;
	}

	public void setD(boolean d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "People [x=" + x + ", y=" + y + ", z=" + z + ", a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	
}
