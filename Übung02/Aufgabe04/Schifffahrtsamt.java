
public class Schifffahrtsamt 
{
	private Schiff[] schiffe = new Schiff[50];
	
	public void registriereSchiff(Schiff schiff)
	{
		for (int i = 0; i < 50; i++)
		{
			if (schiffe[i] == null)
			{
				schiffe[i] = schiff;
				break;
			}
		}
	}
	
	public void meldung(String nachricht, int dringlichkeit)
	{
		if (dringlichkeit == 1)
		{
			for (int i = 0; i < 50; i++)
			{
				if (schiffe[i] != null)
				{
					schiffe[i].empfangeNachricht(nachricht);
				}
			}
		}
	}
	
	public static String getKennzeichen()
	{
		java.util.Random rnd = new java.util.Random();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 6; i++)
		{
			sb.append((char)((rnd.nextInt(25)+65)));
		}
		return sb.toString();
	}
}
