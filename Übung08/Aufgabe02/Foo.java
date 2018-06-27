
public class Foo
{
	public static <T> T bar(T x, T y)
	{
		return x;
	}
	
	public static void main(String[] args)
	{
		/*
		 * 
		Object o;
		R r = new R();
		E e = new E();
		B b = new B();
		G g = new G();
		U u = new U();
		R[] x;
		E[] y;
		
		//Stelle 1: 
		//bar als generische Funktion
		
		//r = bar(r,r); RICHTIG
		
		// Ja, denn bar bekommt 2 Parameter vom Typ R übergeben und gibt ein
		// somit Objekt vom Typ R zurück (r ist R)
		
		//r = bar(b,r); FEHLER
		
		// Nein, denn bar bekommt Parameter vom Typ B und R übergeben und gibt somit
		// ein Objekt des Typs Object zurück, weil T nicht eindeutig ist (r ist R)
		
		//r = bar(e,g); FEHLER
		
		// Nein, denn bar bekommt Parameter vom Typ E und G übergeben und gibt somit
		// ein Objekt des Typs Object zurück, weil T nicht eindeutig ist (r ist R)
		
		//r = bar(b,g); FEHLER
		
		// Nein, denn bar bekommt Parameter vom Typ B und G übergeben und gibt somit
		// ein Objekt des Typs Object zurück, weil T nicht eindeutig ist (r ist R)
		
		//e = bar(r,b); //FEHLER
		
		// Nein, denn bar bekommt Parameter vom Typ R und B übergeben und gibt somit
		// ein Objekt des Typs Object zurück, weil T nicht eindeutig ist (e ist E)
		
		//u = bar(u,r); FEHLER
		
		// Nein, denn bar bekommt Parameter vom Typ U und R übergeben und gibt somit
		// ein Objekt des Typs Object zurück, weil T nicht eindeutig ist (u ist U)
		
		//o = bar(e,u); RICHTIG
		
		// Ja, bar bekommt zwar zwei Parameter unterschiedlichen Typs, aber o ist
		// vom Typ Object - es fehlt kein Cast
		
		//b = bar(e,g); FEHLER
		
		// Nein, denn bar bekommt Parameter vom Typ E und G übergeben und gibt somit
		// ein Objekt des Typs Object zurück, weil T nicht eindeutig ist (b ist B)
		
		//x = bar(new E[2], new B[4]); FEHLER
		
		// Nein, denn bar bekommt Parameter vom Typ E[] und B[] übergeben und gibt somit
		// ein Objekt des Typs Object[] zurück, weil T nicht eindeutig ist (x ist R[])
		
		//y = bar(new E[4], new B[11]); FEHLER
		
		// Nein, denn bar bekommt Parameter vom Typ E[] und B[] übergeben und gibt somit
		// ein Objekt des Typs Object[] zurück, weil T nicht eindeutig ist (x ist E[])
		
		//o = bar(new G[8], new U[5]); RICHTIG
		
		// Ja, bar bekommt zwar zwei Parameter unterschiedlichen Typs, aber o ist vom
		// Typ Object, folglich kann ein Verweis auf Object[] auch in o gespeichert
		// werden

		 */
	}
}
