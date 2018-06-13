
public class Person implements Comparable
{
	private String Name;
	private String Vorname;
	private Integer Postleitzahl;
	private String Strasse;
	private Integer Hausnummer;
	
	public Person(String Name, String Vorname, Integer Postleitzahl,
			String Strasse, Integer Hausnummer)
	{
		this.Name = Name;
		this.Vorname = Vorname;
		this.Postleitzahl = Postleitzahl;
		this.Strasse = Strasse;
		this.Hausnummer = Hausnummer;
	}
	
	public void printMe()
	{
		System.out.println(Name + " " + Vorname + ", " +
		 Postleitzahl + " " + Strasse + " " + Hausnummer);
	}
	
	@Override
	public int compareTo(Object obj)
	{		
		if (!(obj instanceof Person))
		{
			/*
			 * Falls gewünscht, kann man das hier abfangen => Error Handling
			 */
		}
		
		Person vgl = (Person) obj;
		
		int result = 0;
		
		result = this.Name.compareTo(vgl.Name);
		if (result != 0)
			return result;
		
		result = this.Vorname.compareTo(vgl.Vorname);
		if (result != 0)
			return result;
		
		result = this.Postleitzahl.compareTo(vgl.Postleitzahl);
		if (result != 0)
			return result;
		
		result = this.Strasse.compareTo(vgl.Strasse);
		if (result != 0)
			return result;
		
		return this.Hausnummer.compareTo(vgl.Hausnummer);
	}
}
