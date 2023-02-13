/**
 * @author N'ZO LAGOU
 * 
 * 
🌟 Exercice 4 : Implémenter La Classe Informatique
Instructions
Créez une nouvelle classe appelée Computer.

Ajoutez 3 propriétés, 2 méthodes et un constructeur.

Ajoutez deux sous-classes supplémentaires : Laptop et SmartPhone.

Pour une classe enfant, ajoutez au moins 1 propriété 
supplémentaire et 1 méthode supplémentaire.
 */

package exercice4;

public class Computer {

	private String screem;
    private String processor;
    private int memory;

    public String getBrand() {
        return screem;
    }
   

    public String getScreem() {
		return screem;
	}


	public void setScreem(String screem) {
		this.screem = screem;
	}


	public String getProcessor() {
		return processor;
	}


	public void setProcessor(String processor) {
		this.processor = processor;
	}


	public int getMemory() {
		return memory;
	}


	public void setMemory(int memory) {
		this.memory = memory;
	}


	Computer(String brand, String processor, int memory) {
        this.screem = brand;
        this.processor = processor;
        this.memory = memory;
    }

    public void printSpecs() {
        System.out.println("screem: " + this.screem);
        System.out.println("Processor: " + this.processor);
        System.out.println("Memory: " + this.memory + "GB");
    }

    public void start() {
        System.out.println("The laptop it's Getting up...");
    }
}
