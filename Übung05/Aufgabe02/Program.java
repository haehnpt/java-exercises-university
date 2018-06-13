
public class Program
{

	public static void main(String[] args)
	{
		java.util.ArrayList<Koerper> koerper = new java.util.ArrayList<Koerper>();
		
		koerper.add(new Quader(1,2,3,10,20,30));
		koerper.add(new Quader(new Position(5,-2,-3),5,6,4));
		koerper.add(new Kugel(0,0,13, 4.5d));
		koerper.add(new Kugel(new Position(2,-4,5), 2d));
		
		for (Koerper k : koerper)
		{
			k.getInformation();
		}

	}

}
