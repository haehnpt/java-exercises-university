
public class Program2
{

	public static void main(String[] args)
	{
		Student student = new Student();
		
		Cauliflower essen1 = new Cauliflower();
		student.eat(essen1);
		
		/*
		 * Aufgabe 3a)
		 * 
		 * Ausgabe:
		 * I don't like Blumenkohl an Gorgonzolasoße
		 * 
		 * Grund:
		 * Es wird die Methode Student.eat(Cauliflower cauliflower)
		 * aufgerufen, da ein Cauliflower-Objekt als Parameter
		 * übergeben wird
		 * 
		 */
		
		Spaghetti essen2 = new Spaghetti();
		student.eat(essen2);
		
		/*
		 * Aufgabe 3b)
		 * 
		 * Ausgabe:
		 * I like Spaghetti Bologneser Art
		 * 
		 * Grund:
		 * Es wird die Methode Student.eat(Food food) aufgerufen,
		 * da ein Spaghetti-Objekt als Parameter übergeben wird und
		 * keine Methode mit diesem Objekt als Parameter existiert,
		 * wodurch die Methode mit Food (Interface = abstrakte Klasse
		 * und in Spaghetti implementiert) als Parameter aufgerufen
		 * 
		 */
		
		Food essen = new Cauliflower();
		student.eat(essen);
		
		/*
		 * Aufgabe 3c)
		 * 
		 * Ausgabe:
		 * I like Blumenkohl an Gorgonzolasoße
		 * 
		 * Grund: 
		 * Es wird die Methode Student.eat(Food food) aufgerufen,
		 * da eine Food-Referenz übergeben wird. Scheinbar wird
		 * also bei Verweisen durch Interfaces nicht unterschieden,
		 * welches Objekt "dahintersteckt", sodass nicht Student.eat(
		 * Cauliflower cauliflower) aufgerufen wird
		 */
	}

}
