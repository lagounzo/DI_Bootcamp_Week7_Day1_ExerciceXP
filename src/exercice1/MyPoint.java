/**
 * @author N'ZO LAGOU
 * 
 * Exercice 1 : Implémenter La Classe MyPoint
Instructions
Une classe appelée MyPoint, qui modélise un point 2D avec des coordonnées x et y, est conçue comme indiqué dans le diagramme de classes.



Exercice1XP


Il contient:

Deux variables d'instance x(int) et y(int).

Un constructeur par défaut (ou "sans argument" ou "sans argument") qui construit un point à l'emplacement par défaut de (0, 0).

Un constructeur surchargé qui construit un point avec les coordonnées x et y données.

Getter et setter pour les variables d'instance x et y.

Une méthode setXY()pour définir à la fois x et y.
Une méthode getXY()qui renvoie x et y dans un tableau int à 2 éléments.
Une toString()méthode qui renvoie une description de chaîne de l'instance au format "(x, y)".

Une méthode appelée distance(int x, int y)qui renvoie la distance de ce point à un autre point aux coordonnées (x, y) données, par exemple,



JAVA
MyPoint p1 = new MyPoint(3, 4);
System.out.println(p1.distance(5, 6));
 */


package exercice1;

public class MyPoint {

	// attribut
	
	private int x; 
	private int y;
	
	public MyPoint() {
		super();
		// TODO Auto-generated constructor stub
		x = 0;
		y = 0;
		
	}

	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

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

	@Override
	public String toString() {
		return "MyPoint [x=" + x + ", y=" + y + "]";
	} 
	
	// class methode 
	
	public double distance(int x, int y) {
		
		double distance1 = Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
		return distance1;
		
	}
	
}
