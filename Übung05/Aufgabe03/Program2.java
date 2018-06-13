
public class Program2
{
	public static void main(String[] args)
	{
		/*
		 * Testing
		 */
		double[] temp = {2d, -3d, 4d, 11d, -4d, -4d, -3d, 20d, -10d};
		selectionSort(temp);
		for (double g : temp)
		{
			System.out.println(g);
		}
	}
	
	public static void selectionSort(double[] array)
	{
		int insertIndex = 0, minIndex = 0;
		double temp = 0;
		do
		{
			minIndex = insertIndex;
			for (int i = insertIndex + 1; i < array.length; i++)
			{
				if (array[i] < array[minIndex])
					minIndex = i;
			}
			temp = array[insertIndex];
			array[insertIndex] = array[minIndex];
			array[minIndex] = temp;
			insertIndex += 1;
		} while (insertIndex < array.length - 1);
	}
}
