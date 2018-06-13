
public class Sheep
{
	public String name;
	public Fur fur;
	
	public Sheep(String name, Fur fur) 
	{
		this.name = name;
		this.fur = fur;
	}
	
	public void shear() 
	{
		fur.length = 0;
	}
	
	public String toString() 
	{
		return "Name: " + name + " " + fur.toString();
	}
	
	public Sheep clone() 
	{
		return this;
	}
	
	/*
	 * Aufgabe 2b:
	 * 
	 * Shallow Cloning: Klonen des "Hauptobjekts", aber nicht seiner 
	 * Attribute, die selbst Objekte sind. Stattdessen werden die Referenzen
	 * auf die Attribute des Hauptobjektes übernommen.
	 * 
	 * Deep Cloning: Klonen des "Hauptobjekts", auch seine Attribute,
	 * die selbst Objekte sind. Folglich werden nicht die Referenzen
	 * des Hauptobjektes übernommen, sondern es werden neue Objekte 
	 * erzeugt.
	 * 
	 */
	
	public Sheep shallowclone()
	{
		return new Sheep(this.name, fur);
	}
	
	public Sheep deepclone()
	{
		return new Sheep(this.name, new Fur(this.fur.length));
	}
	
	/*
	 * Aufgabe 2c: 
	 * 
	 * Implementierung von equals()
	 */
	
	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Sheep))
		{
			return false;
		}
		
		Sheep temp = (Sheep)obj;
		
		return this.name.equals(temp.name) &&
				this.fur.length == temp.fur.length;
	}
	
	/*
	 * Aufgabe 2d:
	 * 
	 * Das Interface Cloneable muss eingebunden werden, falls man eine clone() Methode definiert,
	 * welche Object.clone() überschreibt, um zu kennzeichnen, dass die clone() Methode das Objekt
	 * feldweise kopieren *darf* via super.clone()
	 */
}
