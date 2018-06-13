
public class LineareFunktion implements Evaluierbar
{
	public String getName()
	{
		return "Funktion: 3x + 42";
	}
	
	public int evaluate(int x)
	{
		return 3 * x + 42;
	}
}
