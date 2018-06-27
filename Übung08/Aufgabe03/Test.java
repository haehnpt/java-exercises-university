
public class Test
{
	public static void main(String[] args)
	{
		Stack<String> stack = new Stack<String>();
		stack.setDisplay();
		stack.push("Apfel");
		stack.setDisplay();
		stack.push("Orange");
		stack.setDisplay();
		stack.pop();
		stack.setDisplay();
		stack.push("Erdbeere");
		stack.setDisplay();
		stack.push("Kiwi");
		stack.setDisplay();
		for (int i = 0; i < 4; i++)
		{
			stack.pop();
			stack.setDisplay();
		}
	}
}
