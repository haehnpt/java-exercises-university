
public class Baum
{
	/*
	 * Class enums
	 */
	public enum TraversierungsTyp
	{
		Preorder,
		Inorder,
		Postorder
	}
	
	/*
	 * Member variables
	 */
	
	private TNode root = null;
	
	/*
	 * Constructors
	 */
	
	public Baum()
	{
		
	}
	
	public Baum(TNode root)
	{
		this.root = root;
	}
	
	/*
	 * Getters & Setters
	 */
	
	public TNode getRoot()
	{
		return root;
	}
	
	public void setRoot(TNode root)
	{
		this.root = root;
	}
	
	/*
	 * Public Methods
	 */
	
	public void traversiere(TraversierungsTyp type)
	{
		System.out.println("Traversierungsreihenfolge (" + type.toString()+ "):");
		
		if (root != null)
		{
			switch (type)
			{
				case Preorder:
				{
					traversierePreorder(root);
					break;
				}
				case Inorder:
				{
					traversiereInorder(root);
					break;
				}
				case Postorder:
				{
					traversierePostorder(root);
					break;
				}
			}
		}
		else
		{
			System.out.println("Der Baum ist leer.");
		}
	}
	
	public void levelorder()
	{		
		System.out.println("Levelorder:");
		
		if (root != null)
		{
			java.util.LinkedList<TNode> waitingList = new java.util.LinkedList<TNode>();
			System.out.println(root.getValue());
			waitingList.add(root);
			String output = "";
			int k = 0;
			while (waitingList.size() > 0)
			{
				output = "";
				k = waitingList.size();
				for (int i = 0; i < k; i++)
				{
					if (waitingList.get(i).getLeft() != null)
					{
						output += waitingList.get(i).getLeft().getValue() + " ";
						waitingList.add(waitingList.get(i).getLeft());
					}
					if (waitingList.get(i).getRight() != null)
					{
						output += waitingList.get(i).getRight().getValue() + " ";
						waitingList.add(waitingList.get(i).getRight());
					}
				}
				for (int g = 0; g < k; g++)
				{
					waitingList.removeFirst();
				}
				System.out.println(output);
			}
		}
		else
		{
			System.out.println("Der Baum ist leer.");
		}
	}
	
	/*
	 * Private Methods
	 */
	
	private void traversierePreorder(TNode current)
	{
		System.out.println(current.getValue());
		
		if (current.getLeft() != null)
		{
			traversierePreorder(current.getLeft());
		}
		
		if (current.getRight() != null)
		{
			traversierePreorder(current.getRight());
		}
	}
	
	private void traversiereInorder(TNode current)
	{		
		if (current.getLeft() != null)
		{
			traversiereInorder(current.getLeft());
		}
		
		System.out.println(current.getValue());
		
		if (current.getRight() != null)
		{
			traversiereInorder(current.getRight());
		}
	}
	
	private void traversierePostorder(TNode current)
	{
		if (current.getLeft() != null)
		{
			traversierePostorder(current.getLeft());
		}
		
		if (current.getRight() != null)
		{
			traversierePostorder(current.getRight());
		}
		
		System.out.println(current.getValue());
	}
}





