package Problem5.Spring6;

public class Student {
	private Chocolate choco;
	public Student(Chocolate choco) {
		super();
		this.choco = choco;
	}
	public Chocolate getChoco() {
		return choco;
	}
	public void setChoco(Chocolate choco) {
		this.choco = choco;
	}
	public void study()
	{
		this.choco.display();
		System.out.println("Student is reading book");
	}
}