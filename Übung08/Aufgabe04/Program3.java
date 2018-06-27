import java.util.ArrayList;

public class Program3
{
	public static void main(String[] args)
	{	
		ArrayList<Integer> primes = null;
		//primes = Primfaktorzerlegung.getPrimes(100000);
		primes = Primfaktorzerlegung.getPrimes(1000000010);
		/*
		 * Ein Thread
		 */
		long timeOneThread = System.currentTimeMillis();
		
		//Primfaktorzerlegung.setPrimfaktorenOnDisplay(2, 100000, primes);
		Primfaktorzerlegung.setPrimfaktorenOnDisplay(1000000000, 1000000010, primes);
		timeOneThread = Math.abs(timeOneThread - System.currentTimeMillis());
		double dTimeOneThread = timeOneThread / 1000d;
		System.out.println("Zeit mit einem Thread: " + dTimeOneThread + "s");
		
		/*
		 * Zwei Threads
		 */
		long timeTwoThreads = System.currentTimeMillis();
		
		//PrimfaktorzerlegungThreads a = new PrimfaktorzerlegungThreads(2, 100000, 0, primes);
		//PrimfaktorzerlegungThreads b = new PrimfaktorzerlegungThreads(2, 100000, 1, primes);
		PrimfaktorzerlegungThreads a = new PrimfaktorzerlegungThreads(1000000000, 1000000010, 0, primes);
		PrimfaktorzerlegungThreads b = new PrimfaktorzerlegungThreads(1000000000, 1000000010, 1, primes);
		
		a.start();
		b.start();
		
		Boolean running = true;
		
		while (running)
		{
			try
			{
				a.join();
				b.join();
				running = false;
			}
			catch (Exception x)
			{
				running = true;
			}
		}
		
		timeTwoThreads = Math.abs(timeTwoThreads - System.currentTimeMillis());
		double dTimeTwoThreads = timeTwoThreads / 1000d;
		
		System.out.println("Zeit mit einem Thread: " + dTimeOneThread + "s");
		System.out.println("Zeit mit zwei Threads: " + dTimeTwoThreads + "s");
		
		/*
		 * Aufgabenteil c:
		 * 
		 * Primfaktorzerlegung zwischen 2 und 100000
		 * Zeit mit einem Thread: 6.166s
	     * Zeit mit zwei Threads: 4.994s
	     * 
	     * Primfaktorzerlegung zwischen 1000000000 und 1000000010
	     * joa...
	     * 
	     * 
	     * Berechnung der Primfaktorzerlegung für das zweite Intervall benötigt
	     * deutlich länger aufgrund der Berechnung der Primzahlen, somit ist
	     * es nicht sinnvoll für ein solch kleines Intervall zwei Threads zu starten
		 */
	}
}
