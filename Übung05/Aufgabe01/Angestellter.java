
public class Angestellter
{
	/*
	 * vorname und nachname könnten auch public final gesetzt werden
	 */
	private String vorname;
	private String nachname;
	private int alter;
	private int gehalt;
	
	public Angestellter(String vorname, String nachname, int alter, int gehalt)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.alter = alter;
		this.gehalt = gehalt;
	}
	
	public String getVorname()
	{
		return this.vorname;
	}
	
	public String getNachname()
	{
		return this.nachname;
	}
	
	public int getAlter()
	{
		return this.alter;
	}
	
	public int getGehalt()
	{
		return this.gehalt;
	}
	
	public void raiseAlter()
	{
		this.alter++;
	}
	
	public void raiseGehalt(int value)
	{
		this.gehalt += value;
	}
}
