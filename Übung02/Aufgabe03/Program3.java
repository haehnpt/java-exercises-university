
public class Program3
{
	//Aufgabe 3
	public long euklid(long a, long b)
	{
		if (a == 0) return b;
		while (b != 0)
		{
			if (a > b) 
				a -= b;
			else
				b -= a;
		}
		return a;
	}
}
