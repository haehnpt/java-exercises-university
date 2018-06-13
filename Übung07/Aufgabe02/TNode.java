
public class TNode
{
	/*
	 * Member variables
	 */
	
	private TNode left = null;
	private TNode right = null;
	private int value = 0;
	
	/*
	 * Constructors
	 */
	
	public TNode()
	{
		
	}
	
	public TNode(int value)
	{
		this.value = value;
	}
	
	public TNode(int value, TNode left)
	{
		this.value = value;
		this.left = left;
	}
	
	public TNode(int value, TNode left, TNode right)
	{
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	/*
	 * Getters & Setters
	 */
	
	public int getValue()
	{
		return value;
	}
	
	public void setValue(int value)
	{
		this.value = value;
	}
	
	public TNode getLeft()
	{
		return left;
	}
	
	public void setLeft(TNode left)
	{
		this.left = left;
	}
	
	public TNode getRight()
	{
		return right;
	}
	
	public void setRight(TNode right)
	{
		this.right = right;
	}
}









