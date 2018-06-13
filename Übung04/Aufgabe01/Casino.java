
public class Casino
{
	static public java.util.Scanner sc = new java.util.Scanner(System.in);
	
	public static void main(String[] args) throws java.io.IOException
	{
		Spielemanager sm = new Spielemanager(50);
		while (true)
		{
			System.out.println("\nWas möchtest du spielen?");
			System.out.println("Funktionenraten [f]\nHochTief [h]\nBeenden [x]");
			String input = "";
			do
			{
				try
				{
					input = sc.nextLine().toLowerCase();
					if (!(input.equals("f") || input.equals("h") || input.equals("x")))
					{
						input = "";
						System.out.println("Unbekannte Eingabe. Erneut eingeben:");
					}
				}
				catch (Exception ex)
				{
					System.out.println("Unbekannte Eingabe. Erneut eingeben:");
				}
			} while (input == "");
			if (input.equals("x"))
				break;
			sm.starteSpiel(input.equals("h") ? new HochTief() : new Funktionswerteraten());
			System.out.println("Aktuelles Kapital: " + sm.getKapital());
			if (sm.getKapital() < 1)
			{
				System.out.println("Du bist pleite!");
				break;
			}
		}
		sc.close();
	}
}
