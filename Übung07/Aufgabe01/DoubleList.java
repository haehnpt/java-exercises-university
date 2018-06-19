
public class DoubleList
{
	private DoubleNode head = null;
	
	public DoubleList()
	{
		
	}
	
	public DoubleList(DoubleNode head)
	{
		this.head = head;
	}
	
	public DoubleNode getHead()
	{
		return head;
	}
	
	public void setHead(DoubleNode head)
	{
		if (this.head == null)
		{
			this.head = head;
		}
		else
		{
			head.setNext(this.head.getNext());
			this.head = head;
		}
	}
	
	public void add(double d)
	{
		if (head == null)
		{
			head = new DoubleNode(d);
		}
		else
		{
			DoubleNode current = head;
			while (current.getNext() != null)
			{
				current = current.getNext();
			}
			current.setNext(new DoubleNode(d));
		}
	}
	
	public void insertFirst(double d)
	{
		if (head == null)
		{
			head = new DoubleNode(d);
		}
		else
		{
			head = new DoubleNode(d, head);
		}
	}
	
	public double get(int i)
	{
		final double errorCode = -1;
		
		if (i < 0 || head == null)
		{
			System.out.println("Es wurde ein ungültiger Index gewählt in \"double get(int i)\")");
			return errorCode;
		}
		else
		{
			DoubleNode current = head;
			for (int g = 0; g < i; g++)
			{
				if (current.getNext() == null)
				{
					System.out.println("Es wurde ein ungültiger Index gewählt in \"double get(int i)\")");
					return errorCode;
				}
				else
				{
					current = current.getNext();
				}
			}
			return current.getValue();
		}
	}
	
	//Methode umbenannt, weil Object toString() enthält
	public void listToString()
	{
		String output = "List: ";
		if (head == null)
		{
			output += "empty";
		}
		else
		{
			DoubleNode current = head;
			while (current != null)
			{
				output += current.getValue() + (current.getNext() != null ? ";" : "");
				current = current.getNext();
			}
		}
		System.out.println(output);
	}
	
	public void remove(int i)
	{
		if (i < 0 || head == null)
		{
			System.out.println("Es wurde ein ungültiger Index gewählt in \"double remove(int i)\")");
		}
		else
		{
			DoubleNode previous = null;
			DoubleNode current = head;
			for (int g = 0; g < i; g++)
			{
				if (current.getNext() == null)
				{
					System.out.println("Es wurde ein ungültiger Index gewählt in \"double remove(int i)\")");
					return;
				}
				else
				{
					previous = current;
					current = current.getNext();
				}
			}
			
			if (current != head)
			{
				previous.setNext(current.getNext() == null ? null : current.getNext());
			}
			else
			{
				head = current.getNext() == null ? null : current.getNext();
			}
		}
	}
}







