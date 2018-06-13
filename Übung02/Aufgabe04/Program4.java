
public class Program4
{
	public static void main(String[] args)
	{
		/*
		 * Test der 4. Aufgabe
		 */
		Schifffahrtsamt amt = new Schifffahrtsamt();
		Werft w1 = new Werft();
		w1.produziereSchiff("Gertrut", 12.5, amt);
		Schiff sc1 = new Schiff("Merlin", 45.9);
		amt.registriereSchiff(sc1);
		sc1.setKennzeichen(Schifffahrtsamt.getKennzeichen());
		amt.meldung("Havarie im Rhein bei Rheinkilometer 591", 1);
		amt.meldung("Sonnenschein bei Rheinkilometer 650", 0);
	}
}
