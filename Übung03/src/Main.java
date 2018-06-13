
interface Playable
{
	void song();
}

public class Main
{
	public static void main(String[] args)
	{
		//Aufgabe 1
		
		/*
		 * 1. C2::f1 //Polymorphismus, a ist C2
		 * 2. C2::f1 //b ist trotz Casts C2, Cast zu Basisklasse bringt nichts
		 * 3. Laufzeitfehler, s ist static und sollte nicht als
		 * 	  Member zugegriffen werden
		 * 4. C2::f1
		 * 5. C1::f2
		 * 6. C2::f3
		 * 7. Kompilierfehler, f3 ist nicht in C1 bekannt
		 * 8. Kompilierfehler, Basisklasse C1 kann nicht in C2
		 * 	  gecastet werden
		 */
		
		
		//Aufgabe 2a
		
		Sheep sheep = new Sheep("Beatrix", new Fur(10));
		Sheep cloned = sheep.clone();
		
		System.out.println("clone()");
		System.out.println(sheep.toString());
		System.out.println(cloned.toString());
		
		cloned.name = "Bernd";
		cloned.shear();
		
		System.out.println("Namensänderung und shear() ist erfolgt");
		System.out.println(sheep.toString());
		System.out.println(cloned.toString());
		
		/*
		 * clone() klont "nicht wirklich", sondern kopiert nur den 
		 * Verweis auf das Objekt sheep in das Objekt cloned, folglich
		 * werden durch die Änderung des Namens und durch shear() auch
		 * die Attribute von sheep geändert
		 */
		
		//Aufgabe 2b
		
		//Shallow Cloning 
		sheep = new Sheep("Beatrix", new Fur(10));
		cloned = sheep.shallowclone();
		
		System.out.println("shallowclone()");
		System.out.println(sheep.toString());
		System.out.println(cloned.toString());
		
		cloned.name = "Bernd";
		cloned.shear();
		
		System.out.println("Namensänderung und shear() ist erfolgt");
		System.out.println(sheep.toString());
		System.out.println(cloned.toString());
		
		//Deep Cloning 
		sheep = new Sheep("Beatrix", new Fur(10));
		cloned = sheep.deepclone();
		
		System.out.println("deepclone()");
		System.out.println(sheep.toString());
		System.out.println(cloned.toString());
		
		cloned.name = "Bernd";
		cloned.shear();
		
		System.out.println("Namensänderung und shear() ist erfolgt");
		System.out.println(sheep.toString());
		System.out.println(cloned.toString());
		
		/*
		 * Die Ausgaben unterscheiden sich, da beim shallowclone() auf
		 * das gleiche Fur-Objekt verwiesen wird und beim deepclone() die
		 * beiden "Sub-Objekte" unabhängig sind
		 */
		
		//Aufgabe 3
		
		System.out.println("Test der dritten Aufgabe:");
		
		Stereoanlage s=new Stereoanlage();
		Playable pl=new CD();
		s.play(pl);
		pl=new Kassette();
		s.play(pl);
		
		/*
		 * Ausgaben sind unterschiedlich, da Playable pl zunächst
		 * auf ein CD Objekt verweist und anschließend auf ein
		 * Kassette Objekt. Die Referenz wird jeweils an die Methode
		 * play() übergeben
		 */
	}
}
