
public class DoubleNode
{
	private double value = 0d;
	private DoubleNode next = null;
	
	
	public DoubleNode()
	{
		//hello
	}
	
	public DoubleNode(double value)
	{
		this.value = value;
	}
	
	public DoubleNode(double value, DoubleNode next)
	{
		this.value = value;
		this.next = next;
	}
	
	public double getValue()
	{
		return value;
	}
	
	public void setValue(double value)
	{
		this.value = value;
	}
	
	public DoubleNode getNext()
	{
		return next;
	}
	
	public void setNext(DoubleNode next)
	{
		this.next = next;
	}
}
