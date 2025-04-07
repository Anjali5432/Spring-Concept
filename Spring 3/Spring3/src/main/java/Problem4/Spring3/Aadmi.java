package Problem4.Spring3;
import org.springframework.beans.factory.annotation.Autowired;

public class Aadmi {
	@Autowired
	private Pata pata;
	public Pata getPata() {
		return pata;
	}
	//@Autowired
	public void setPata(Pata pata) {
		System.out.println("Setting value inside setter method");
		this.pata = pata;
	}
	@Override
	public String toString() {
		return "Aadmi [pata=" + pata + "]";
	}
	//@Autowired
	public Aadmi(Pata pata) {
		super();
		System.out.println("Setting value inside constructor");
		this.pata = pata;
	}
}