
public class Quader extends Koerper
{
	private double length;
	private double width;
	private double height;
	
	public Quader(double x, double y, double z, double length, double width, double height)
	{
		super(new Position(x,y,z));
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public Quader(Position position, double length, double width, double height)
	{
		super(position);
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void scale(double alpha)
	{
		this.length *= Math.abs(alpha);
		this.width *= Math.abs(alpha);
		this.height *= Math.abs(alpha);
	}
	
	@Override
	public double getVolume()
	{
		return this.length * this.width * this.height;
	}
}
