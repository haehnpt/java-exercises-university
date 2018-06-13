
public class Program
{
	public static void main(String[] args)
	{
		TNode vier = new TNode(4);
		TNode dreizehn = new TNode(13);
		
		TNode drei = new TNode(3, null, vier);
		TNode sieben = new TNode(7);
		TNode fuenfzehn = new TNode(15, dreizehn);
		
		TNode fuenf = new TNode(5, drei, sieben);
		TNode zwoelf = new TNode(12, null, fuenfzehn);
		
		TNode zehn = new TNode(10, fuenf, zwoelf);
		
		Baum baum = new Baum(zehn);
		
		baum.traversiere(Baum.TraversierungsTyp.Preorder);
		baum.traversiere(Baum.TraversierungsTyp.Inorder);
		baum.traversiere(Baum.TraversierungsTyp.Postorder);
		
		baum.levelorder();
		
		/*
		    Output: 
		 
 			Traversierungsreihenfolge (Preorder):
			10
			5
			3
			4
			7
			12
			15
			13
			
			Traversierungsreihenfolge (Inorder):
			3
			4
			5
			7
			10
			12
			13
			15
			
			Traversierungsreihenfolge (Postorder):
			4
			3
			7
			5
			13
			15
			12
			10
			
			Levelorder:
			10
			5 12 
			3 7 15 
			4 13 
		 */
	}
}
