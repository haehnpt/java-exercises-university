
public class Efunktion implements Evaluierbar
{
	public String getName()
	{
		return "Funktion: exp(x)";
	}
	
	public int evaluate(int x)
	{
		return (int) Math.round(Math.pow(Math.E, x));
	}
}
