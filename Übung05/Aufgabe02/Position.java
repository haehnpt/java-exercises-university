
public class Position
{
	private double x = 0;
	private double y = 0;
	private double z = 0;
	
	/*
	 * Constructors
	 */
	
	public Position()
	{
		
	}
	
	public Position(double x)
	{
		this.x = x;
	}
	
	public Position(double x, double y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Position(double x, double y, double z)
	{
		moveTo(x,y,z);
	}
	
	/*
	 * Public Methods 
	 */
	
	public void moveTo(double x, double y, double z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String getPositionString()
	{
		return "Position: (" + this.x + ", " + this.y + ", " + this.z + ")";
	}
}
