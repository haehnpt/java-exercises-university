
public class Program
{
	//Aufgabe 1a
	public long fac(long n)
	{
		return n * (n > 1 ? fac(n-1) : 1);
	}
	
	//Aufgabe 1b
	public long binom(long n, long k)
	{
		return (k < n ? fac(n) / fac(k) * fac(n-k) : 0);
	}
	
	//Aufgabe 1c
	public long lotto(long n, long k)
	{
		return binom(n,k) * fac(k);
	}
	
	/*
	 * Zum Hinweis:
	 * Es erscheinen fehlerhafte Ergebnisse beim Overflow eines long-Datentyps, bspw. ist 21! schon
	 * größer als 2^64 - 1.
	 */
}
