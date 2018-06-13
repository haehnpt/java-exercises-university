
public class Singleton
{
	private static Singleton intern = null;
	
	private Singleton()
	{
		
	}
	
	public Singleton GetSingleton()
	{
		if (intern == null)
		{
			intern = new Singleton();
		}
		return intern;
	}
	
	/*
	 * Aufgabe 4a:
	 * 
	 * Singleton als Entwurfsmuster kann verwendet werden, wenn
	 * man sicherstellen möchte, das zur Laufzeit lediglich ein
	 * Objekt eines Typs existiert, bspw. wenn dieses sehr
	 * speicherlastig ist o.ä.
	 */
}
