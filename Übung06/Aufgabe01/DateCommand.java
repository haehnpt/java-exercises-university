
public class DateCommand implements Runnable
{
	@Override
	public void run()
	{
		java.util.Random r = new java.util.Random();
		for (int i = 0; i < 10; i++)
		{
			System.out.println(java.time.LocalDate.now());
			try
			{
				Thread.sleep(r.nextInt(1000));
			}
			catch (InterruptedException ex)
			{
				
			}
		}
	}

}
