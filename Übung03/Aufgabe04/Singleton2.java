
public class Singleton2
{
	private static Singleton2 intern;
	
	static
	{
		intern = new Singleton2();
	}
	
	private Singleton2()
	{
		
	}
	
	public Singleton2 GetSingleton2()
	{
		return intern;
	}
	
	/*
	 * Aufgabe 4b:
	 * 
	 * Realisierung durch einen static-Block (da Java keine
	 * statischen Konstruktoren unterstützt)
	 */
}
