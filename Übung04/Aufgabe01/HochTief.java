
public class HochTief extends Spiel
{
	public HochTief()
	{
		super("HochTief");
	}

	@Override
	int spiele()
	{
		java.util.Random r = new java.util.Random();
		int rand = Math.abs(r.nextInt() % 101);
		int guess = -1;
		for (int i = 0; i < 5; i++)
		{
			guess = -1;
			System.out.println("(" + (i+1) + "/5) Errate die Zahl:");
			do
			{
				try
				{
					guess = Integer.parseInt(Casino.sc.nextLine());
					if (guess < rand)
					{
						System.out.println("Die eingegebene Zahl ist zu klein.");
					}
					else if (guess > rand)
					{
						System.out.println("Die eingegebene Zahl ist zu groß.");
					}
					else
					{
						System.out.println("Glückwunsch. Die eingegebene Zahl ist korrekt. Gewinn (abzüglich Einsatz): " + super.getEinsatz());
						return super.getEinsatz() * 2;
					}
				}
				catch (Exception ex)
				{
					System.out.println("Fehlerhafte Angabe. Erneut raten:");
				}
			} while (guess == -1);
		}
		System.out.println("Du hast es nicht geschafft.");
		return 0;
	}
}
