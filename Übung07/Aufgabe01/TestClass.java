
public class TestClass
{

	public static void main(String[] args)
	{
		DoubleList list = new DoubleList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.insertFirst(4);
		list.insertFirst(5);
		
		list.listToString();
		
		list.remove(2);
		list.remove(0);
		list.remove(2);
		
		list.listToString();
		
		System.out.println("First Value: " + list.getHead().getValue());
		
		/*
		 * Ausgabe
		 * 
		 * List: 5.0;4.0;1.0;2.0;3.0
		 * List: 4.0;2.0
		 * First Value: 4.0
		 * 
		 * => ist korrekt
		 */
	}

}
