package exercice4;

public class SystemIt extends Computer {

	   String systemInformation;

	    SystemIt(String brand, String processor, int memory, String systemInformation) {
	        super(brand, processor, memory);
	        this.systemInformation = systemInformation;
	    }

	    public void printIsa() {
	        super.printSpecs();
	        System.out.println("system Information: " + this.systemInformation);
	    }

	    public void makeCall() {
	        System.out.println("Ongoing call...");
	    }

}
