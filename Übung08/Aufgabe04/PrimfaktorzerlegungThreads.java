import java.util.ArrayList;

public class PrimfaktorzerlegungThreads extends Thread
{
	private int offset = 0;
	private int min = 0;
	private int max = 0;
	private ArrayList<Integer> primes = null;
	
	public PrimfaktorzerlegungThreads(int min, int max, int offset, ArrayList<Integer> primes)
	{
		this.offset = offset != 1 ? 0 : 1;
		this.min = min;
		this.max = max;
		this.primes = primes;
	}
	
	public void run()
	{
		setPrimfaktorenOnDisplay(min, max);
	}
	
	private void setPrimfaktorenOnDisplay(int min, int max)
	{
		if (min < 0 || max < 0 || max < min)
		{
			System.out.println("Invalide Intervallgrenzen angegeben");
			return;
		}
		
		int product = 1;
		for (int i = min + offset; i <= max; i += 2)
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
}
