import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class Stack<Q> implements IStack<Q>
{
	private ArrayList<Q> elements = new ArrayList<Q>();
	
	public Stack(ArrayList<Q> elements)
	{
		this.elements = elements;
	}
	
	public Stack()
	{
		
	}
	
	@Override
	public Q pop()
	{
		if (elements.size() < 1)
		{
			return null;
		}
		Q temp = elements.get(elements.size() - 1);
		ArrayList<Q> newElements = new ArrayList<Q>();
		for (int i = 0; i < elements.size() - 1; i++)
		{
			newElements.add(elements.get(i));
		}
		elements = newElements;
		return temp;
	}

	@Override
	public void push(Q element)
	{
		elements.add(element);		
	}	
	
	public void setDisplay()
	{
		String output = "Stack: ";
		for (Q q : elements)
		{
			output += q.toString() + " ";
		}
		System.out.println(output);
	}
	
	/*
	 * Alle weiteren Methoden wurden nicht implementiert
	 */
	
	@Override
	public boolean add(Q arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void add(int arg0, Q arg1)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends Q> arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int arg0, Collection<? extends Q> arg1)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear()
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(Object arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Q get(int arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object arg0)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty()
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<Q> iterator()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object arg0)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<Q> listIterator()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<Q> listIterator(int arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Q remove(int arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeAll(Collection<?> arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> arg0)
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Q set(int arg0, Q arg1)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size()
	{
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Q> subList(int arg0, int arg1)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray()
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}
}
