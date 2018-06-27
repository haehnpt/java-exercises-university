
import java.util.ArrayList;

public class Primfaktorzerlegung
{
	public static void setPrimfaktorenOnDisplay(int min, int max, ArrayList<Integer> primes)
	{
		if (min < 0 || max < 0 || max < min)
		{
			System.out.println("Invalide Intervallgrenzen angegeben");
			return;
		}
		
		int product = 1;
		for (int i = min; i <= max; i++)
		{
			product = 1;
			System.out.print(i + ": ");
			while (product != i)
			{
				for (Integer g : primes)
				{
					if (g > (i / 2))
					{
						break;
					}
					if ((i / product) % g == 0)
					{
						System.out.print(g + " ");
						product *= g;
						break;
					}
				}
				if (product == 1)
				{
					break;
				}
			}
			if (product == 1)
			{
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
	
	public static ArrayList<Integer> getPrimes(int until)
	{
		System.out.println("Berechne Primzahlen bis " + until + "...");
		ArrayList<Integer> primes = new ArrayList<Integer>();
		Boolean isPrime = true;
		
		int hundredthousandth = until / 100000;
		
		for (int i = 3; i <= until; i += 2)
		{
			for (Integer g : primes)
			{
				if (i % g == 0)
				{
					isPrime = false;
					break;
				}
			}
			
			if (isPrime)
			{
				primes.add(i);
				//System.out.println(i);
			}
			
			isPrime = true;
			
			if ((i + 1) % hundredthousandth == 0)
			{
				System.out.println(((i + 1) / hundredthousandth / 1000d) + " %");
			}
		}
		primes.add(0, 2);
		System.out.println("Primzahlen berechnet.");
		return primes;
	}
}
