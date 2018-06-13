
public class Spielemanager
{
	private int Kapital;
	
	public Spielemanager(int kapital)
	{
		this.Kapital = kapital;
	}
	
	public int getKapital()
	{
		return Kapital;
	}
	
	public void starteSpiel(Spiel sp) throws java.io.IOException
	{
		System.out.println("Wie viel möchtest du setzen?");
		int val = -1;
		do
		{
			try
			{
				val = Integer.parseInt(Casino.sc.nextLine());
				if (val >= 1 && Kapital < val)
				{
					val = -1;
					System.out.println("Das Spielerkapital reicht nicht aus. Erneut eingeben:");
				}
				else if (val < 1)
				{
					val = -1;
					System.out.println("Einsätze < 1 sind nicht erlaubt. Erneut eingeben:");
				}
			}
			catch (Exception ex)
			{
				System.out.println("Fehlerhaft Eingabe. Erneut eingeben:");
			}
		} while (val == -1);
		sp.setEinsatz(val);
		Kapital -= sp.getEinsatz();
		this.Kapital += sp.spiele();
	}
}
