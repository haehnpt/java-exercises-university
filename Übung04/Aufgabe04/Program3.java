
public class Program3
{
	public static Comparable findMin(Comparable[] x)
	{
		Comparable min = x[0];
		for (int i = 1; i < x.length; i++)
		{
			if (x[i].compareTo(min) < 0)
			{
				min = x[i];
			}
		}
		return min;
	}
	
	public static void main(String[] args)
	{
		/*
		 * Erzeuge Datensätze
		 */
		String[] name = {"Auer", "Bauer", "Carl", "Dreyer"};
		String[] vorname = {"Albert", "Bertha", "Christian", "Dennis"};
		Integer[] plz = { 12345, 26747, 37610, 41623};
		String[] strasse = { "Auerweg", "Bauernallee", "Carlstrasse", "Dreyergasse"};
		Integer[] nmr = { 1, 2, 3, 4};
		
		Person[] people = new Person[20];
		java.util.Random r = new java.util.Random();
		
		for (int i = 0; i < 20; i++)
		{
			people[i] = new Person(
					name[Math.abs(r.nextInt(4))],
					vorname[Math.abs(r.nextInt(4))],
					plz[Math.abs(r.nextInt(4))],
					strasse[Math.abs(r.nextInt(4))],
					nmr[Math.abs(r.nextInt(4))]
					);
		}
		
		/*
		 * Test mit Array of Person
		 */
		
		Person xyz = (Person) findMin(people);
		for (int i = 0; i < 20; i++)
			people[i].printMe();
		System.out.print("Minimum: ");
		xyz.printMe();
		
		/*
		 * Test mit Integer-Array
		 */
		
		Integer[] temp = new Integer[20];
		for (int i = 0; i < 20; i++)
		{
			temp[i] = r.nextInt() % 100;
			System.out.print(temp[i] + " ");
		}
		Integer min = (Integer)findMin(temp);
		System.out.println("\nMinimum: " + min);
	}

}
