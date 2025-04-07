package Program5.Spring5;
//Here we used constructor for dependency injection
//That's why we didn't make the getter and setter method

public class Addition {
	private int a;
	private int b;
	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("Constructor:integer,integer");
	}
	public Addition(double a, double b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor:double,double");
	}
	public Addition(double a, int b) {
		super();
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor:double,integer");
	}
	public Addition(String a, String b) {
		super();
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor:String,String");
	}
	@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	public void addFunction()
	{
		System.out.println("Value of a:"+this.a);
		System.out.println("Value of b:"+this.b);
		System.out.println("Sum is:"+(this.a + this.b));
	}
}