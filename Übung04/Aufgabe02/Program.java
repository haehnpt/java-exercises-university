
public class Program
{
	public static void main(String[] args)
	{
		Auto auto1 = new Lastwagen();
		System.out.println(auto1.reifen); // Ausgabe 1)
		System.out.println(((Lastwagen) auto1).reifen); // Ausgabe 2)
		System.out.println(auto1.getReifen()); // Ausgabe 3)
		System.out.println(((Lastwagen) auto1).getReifen()); // Ausgabe 4)
		
		/*
		 * Aufgabe 2a)
		 * 
		 * Ausgaben:
		 * 
		 * 1. 4
		 *    Es wird auf das Attribut reifen eines Objekts der 
		 *    Klasse Auto zugegriffen
		 * 2. 8
		 * 	  auto1 wird zu Lastwagen gecastet, folglich wird auf
		 * 	  das Attribut reifen der Klasse Lastwagen zugegriffen
		 * 3. 8
		 * 	  Polymorphismus: Hinter auto1 verbirgt sich ein 
		 *    Lastwagen-Objekt, folglich wird auf dessen
		 *    getReifen() zugegriffen
		 * 4. 8
		 *    auto1 wird nochmals explizit zu Lastwagen gecastet,
		 *    es wird wieder auf getReifen() der Klasse
		 *    Lastwagen zugegriffen
		 *    
		 */
		
		/*
		 * Aufgabe 2b)
		 * 
		 * Ausgaben:
		 * 
		 * 1. 4
		 * 2. 8
		 * 3. 4
		 * 4. 4
		 * 
		 * 	  Die 3. und 4. Ausgabe haben sich verändert, da nun
		 *    keine Methode getReifen() mehr in Lastwagen existiert
		 *    und somit getReifen() der Basisklasse Auto aufgerufen
		 *    wird, welches das Attribut der Basisklasse zurückgibt
		 *    
		 */
		
		/*
		 * Aufgabe 2c)
		 * 
		 *    Die Zeile, die für die 3. Ausgabe verantwortlich ist,
		 *    weist nun einen Fehler auf. Es wird versucht, auf die
		 *    Methode getReifen() der Basisklasse Auto zuzugreifen,
		 *    welche nun nicht mehr existiert
		 *    
		 */
	}
}
