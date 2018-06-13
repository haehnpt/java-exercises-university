
public abstract class Koerper
{
	private Position position;
	
	/*
	 * Constructor
	 */
	
	public Koerper(Position position)
	{
		this.position = position;
	}
	
	/*
	 * Public Methods
	 */
	
	public void getInformation()
	{
		System.out.println("Objekt: " + this.getClass().toString().split(" ")[1]);
		System.out.println("Volumen: " + this.getVolume());
		System.out.println(this.position.getPositionString());
	}
	
	/*
	 * Abstract Public Methods
	 */
	
	abstract public void scale(double alpha);
	
	abstract public double getVolume();
}
