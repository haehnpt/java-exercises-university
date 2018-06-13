/*
 * Aufgabe 1a
 * 
 * 1. Unterklasse der Klasse Thread erstellen
 * 2. Interface Runnable implementieren
 * 
 * 1. Vorteil: Es können Parameter über den Constructor
 *    der Unterklasse mitgegeben werden
 * 2. Vorteil: In Java ist nur einfache Vererbung möglich,
 *    somit kann durch Implementierung von Runnable noch von
 *    einer Klasse geerbt werden, was im 1. Fall nicht möglich
 *    ist
 */


public class ThreadTest
{
	public static void main(String args[]){
		Thread t1 = new Thread(new DateCommand());
		t1.start();
		Thread t2 = new Thread(new CounterCommand());
		t2.start();
		}
}

/*
 * Aufgabe 1b
 * 
 * Geordnete Ausgabe der Schleifenwerte, da for-schleife extrem
 * klein (ebenso Datum)
 */

/*
 * Aufgabe 1c
 * 
 * Zufällig angeordnete Ausgabe der Schleifenwerte und Datumswerte
 * aufgrund der zufälligen Verzögerungen der Threadss
 */
