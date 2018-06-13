
public class TestTrace
{
	public static void main(String[] args) 
	{
		CallEg eg = new CallEg(); // use default constructor
		try 
		{
			eg.methodA();
		} 
		catch (ArithmeticException oops) 
		{
			oops.printStackTrace();
		}
	}
	
	/*
	 * Aufgabe 4a
	 * 
	 * - TestTrace.main
	 * - CallEg.methodA
	 * - java.lang.ArithmeticException
	 */
	
	/*
	 * Aufgabe 4b
	 * 
	 * - TestTrace.main
	 * - CallEg.methodA
	 * - CallEg.methodB
	 * - CallEg.methodC
	 * - java.lang.ArithmeticException
	 */
	
	/*
	 * Aufgabe 4c
	 * 
	 * - TestTrace.main
	 * - CallEg.methodA
	 * - CallEg.methodB
	 * - CallEg.methodC
	 * - java.lang.ArithmeticException
	 * 
	 * Für alle try-catch-Blöcke wird der gesamte Stacktrace für
	 * die Exception ausgegeben, d.h. die Exception wird durch
	 * das throw in den catch-Blöcken weitergereicht
	 */
}
