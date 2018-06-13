
public abstract class Spiel
{
	private String Name;
	private int Einsatz;
	
	protected void setEinsatz(int einsatz)
	{
		this.Einsatz = einsatz;
	}
	
	protected int getEinsatz()
	{
		return this.Einsatz;
	}
	
	public Spiel(String name)
	{
		this.Name = name;
	}
	
	protected String getName()
	{
		return this.Name;
	}
	
	abstract int spiele();
}
