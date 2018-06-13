
public class Kugel extends Koerper
{
	private double radius;
	
	/*
	 * Constructors
	 */
	
	public Kugel(double x, double y, double z, double radius)
	{
		super(new Position(x,y,z));
		this.radius = radius;
	}
	
	public Kugel(Position position, double radius)
	{
		super(position);
		this.radius = radius;
	}
	
	/*
	 * Overridden Public Methods
	 */
	
	@Override
	public void scale(double alpha)
	{
		this.radius *= Math.abs(alpha);
	}
	
	@Override
	public double getVolume()
	{
		return Math.PI * Math.pow(this.radius, 3) * 4 / 3;
	}
}
