
public class Praktikant extends Angestellter
{
	public Praktikant(String vorname, String nachname, int alter)
	{
		super(vorname, nachname, alter, 400);
	}
	
	@Override
	public void raiseGehalt(int value)
	{
		System.out.println("Das Gehalt eines Praktikanten kann nicht erhöht werden!");
	}
}
