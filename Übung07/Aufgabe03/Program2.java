
public class Program2
{
	public static void main(String[] args)
	{		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int userInput = 0;
		System.out.println("Enter integer:");
		try
		{
			userInput = sc.nextInt();
		}
		catch (Exception ex)
		{
			
		}
		
		if (userInput > 5)
		{
			throw new NumberTooBigException();
		}
		
		try
		{
			checkIfTooSmall(userInput);
		}
		catch (NumberTooSmallException x)
		{
			
		}
		
		/*
		 * Unterklassen von RuntimeException stellen ungeprüfte Exceptions dar
		 * => Bugs, Logikfehler
		 * => sollten gefixt werden und nicht mit try / catch Blöcken abgefangen
		 *    werden (= schlechter Stil)
		 * 
		 * Unterklassen von Exception stellen geprüfte Exceptions dar
		 * => Fehler, die während der Programmausführung auftreten können
		 * => sollten mit try / catch Blöcken abgefangen werden oder
		 *    mit dem Kennwort throws weitergegeben werden
		 *    
		 * 
		 * 
		 * => Exceptions werden von Eclipse verschieden angezeigt (weiterer
		 *    Hinweis darauf, dass RuntimeExceptions vom Programmierer gefixt
		 *    werden sollten)
		 * 
		 *  Number is too big!
			Exception in thread "main" NumberTooBigException
			at Program2.main(Program2.java:20)
			
			Number is too small!
		 */
	}
	
	public static void checkIfTooSmall(int value) throws NumberTooSmallException
	{
		if (value < 5)
		{
			throw new NumberTooSmallException();
		}
	}
}
