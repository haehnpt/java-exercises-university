
public class Program2
{
	//Aufgabe 2
	public void vergleiche()
	{
		System.out.println(6.5f == 6.5 ? "6.5f == 6.5" : "6.5f != 6.5");  
		/*
		 * 6.5 lässt sich endlich in binär darstellen (110.1), weshalb der Präzisionsunterschied
		 * von double und float beim Vergleich kein Problem darstellt und immer TRUE zurückgegeben
		 * wird.
		 */
		System.out.println(6.4f == 6.4 ? "6.4f == 6.4" : "6.4f != 6.4");  
		/*
		 * 6.4 lässt sich *nicht* endlich in binär darstellen (110,0110011...), weshalb
		 * der Präzisionsunterschied von double und float beim Vergleich ein Problem darstellt
		 * und immer FALSE zurückgegeben wird, da 110.0110(0000...) != 110.0110011... ist.
		 */
	}
}
