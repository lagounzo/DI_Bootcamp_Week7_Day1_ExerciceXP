package exercice4;

public class Pc extends Computer {
	double screenSize;

	Pc(String brand, String processor, int memory, double screenSize) {
		super(brand, processor, memory);
		// TODO Auto-generated constructor stub
		this.screenSize = screenSize;
	}

	public void printIsa() {
		super.printSpecs();
		System.out.println("Screen size: " + this.screenSize + " inches");
	}

	public void closeLamiaa() {
		System.out.println("Closing PC lamiaa...");
	}
}
