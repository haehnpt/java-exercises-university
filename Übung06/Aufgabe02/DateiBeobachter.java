
public class DateiBeobachter implements Runnable
{
	private java.io.File current;
	private long lastModified;
	
	public DateiBeobachter(String path)
	{
		current = new java.io.File(path);
		lastModified = current.lastModified();
	}
	
	public DateiBeobachter(java.io.File file)
	{
		current = file;
		lastModified = current.lastModified();
	}

	@Override
	public void run()
	{
		while (true)
		{
			if (lastModified != current.lastModified())
			{
				System.out.println("Die Datei " + current.getName() + " wurde modifiziert");
				lastModified = current.lastModified();
			}
			try
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e)
			{

			}
			//System.out.println(current.getName());
		}
	}	
}
