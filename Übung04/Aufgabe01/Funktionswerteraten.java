
public class Funktionswerteraten extends Spiel
{
	public Funktionswerteraten()
	{
		super("Funktionswerteraten");
	}

	@Override
	int spiele()
	{
		java.util.Random r = new java.util.Random();
		Evaluierbar func = r.nextBoolean() ?
				new Efunktion() : new LineareFunktion();
		int rand = Math.abs(r.nextInt() % 50 + 1);
		System.out.println(func.getName());
		System.out.println("Zufälliger x-Wert: " + rand);
		System.out.println("Schätze den Funktionswert:");
		int guess = -1;
		do
		{
			try
			{
				guess = Integer.parseInt(Casino.sc.nextLine());
			}
			catch (Exception ex)
			{
				System.out.println("Fehlerhafte Angabe. Erneut schätzen:");
			}
		} while (guess == -1);
		if (Math.abs(func.evaluate(rand) - guess) < 5)
		{
			System.out.println("Schätzung ist gut. Gewinn (abzüglich Einsatz): " + rand);
			return super.getEinsatz() + rand;
		}
		else
		{
			System.out.println("Schätzung ist schlecht. Kein Gewinn.");
			return 0;
		}
	}	
}
