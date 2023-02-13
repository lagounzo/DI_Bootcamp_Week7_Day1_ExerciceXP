/**
 * @author N'ZO LAGOU
 * 
 * Implémentez la classe Person décrite dans le diagramme de classe UML à 
l'aide du langage de programmation Java. 
Faites attention que cette classe n'a pas la méthode principale statique, 
c'est pourquoi elle n'est pas exécutable.

Des exemples d'initialisation d'objet et de format de sortie pour 
la toString()méthode sont donnés ci-dessous.



JAVA
Person person = new Person("John", "Wick", "john@wick.com", 55);
Person{
    name='John',
    lastName='Wick',
    email='john@wick.com', age=55
}
 */

package exercice2;

public class Person {
	
	private String name;
	private String lastName;
	private String email;
	private int age;
	
	public Person(String name, String lastName, String email, int age) {		super();
		// TODO Auto-generated constructor stub
		
			this.name = name;
			this.lastName = lastName;
			this.email = email;
			this.age = age;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + 
				", lastName=" + lastName + 
				", email=" + email + ", age=" 
				+ age + "]";
	}


	
}
