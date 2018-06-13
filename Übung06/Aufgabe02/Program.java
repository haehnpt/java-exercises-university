
public class Program
{
	public static void main(String[] args)
	{
		Thread t = new Thread(new DateiBeobachter("C:\\Users\\Patrick\\Desktop\\Test.txt"));
		t.start();
	}
}
