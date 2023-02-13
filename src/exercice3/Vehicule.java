/**
 * @author N'ZO LAGOU
 * 
 *  Exercice 3 : Implémenter La Classe Dérivée

Implémentez la classe de base Vehicleavec les fonctions membres :

getModel()
etgetSpeed()
qui renvoient respectivement le modelet speedde la voiture.

Implémentez une fonction getDetails(String carName)de la classe Carqui prend une
 chaîne carNameet l'ajoute avec model, nameet speed.
 */



package exercice3;

public class Vehicule {
	protected String model;
	protected int speed;

	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicule(String model, int speed) {
		super();
		this.model = model;
		this.speed = speed;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
