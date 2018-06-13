import java.io.*;

public class Hamburger extends Fastfood
{
	//void eat()
	//void eat() throws Exception
	//void eat(int y) throws Exception
	//void eat() throws FileNotFoundException
	void eat() throws RuntimeException
	{
		
	}
}

/*
 * Aufgabe 3
 * 
 * 1. Möglich, da Hamburger.eat() die Methode Fastfood.eat() überschreibt
 * 2. Nicht möglich, da eat nicht mit throws Exception deklariert
 *    werden darf, da Fastfood.eat() throws IOException existiert
 * 3. Möglich, da die Methode eat überladen wurde mit dem
 *    Parameter int y
 * 4. Möglich, da FileNotFoundException eine Unterklasse von
 *    IOException darstellt
 * 5. Möglich, da IOException eine RuntimeException darstellt
 */
