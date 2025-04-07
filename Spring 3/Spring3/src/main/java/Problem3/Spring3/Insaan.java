package Problem3.Spring3;

public class Insaan {
	/*
	private Jagah jagah1;
	public Insaan(Jagah jagah1) {
		super();
		this.jagah1 = jagah1;
	}
	@Override
	public String toString() {
		return "Insaan [jagah1=" + jagah1 + "]";
	}
*/
	private Jagah jagah2;
	public Insaan(Jagah jagah2) {
		super();
		System.out.println("Inside Insaan constructor");
		this.jagah2 = jagah2;
	}
	@Override
	public String toString() {
		return "Insaan [jagah2=" + jagah2 + "]";
	}
}