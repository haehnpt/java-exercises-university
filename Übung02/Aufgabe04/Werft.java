
public class Werft 
{
	public void produziereSchiff(String name, double laenge, Schifffahrtsamt amt)
	{
		Schiff schiff = new Schiff(name, laenge);
		amt.registriereSchiff(schiff);
		schiff.setKennzeichen(Schifffahrtsamt.getKennzeichen());
	}
}
