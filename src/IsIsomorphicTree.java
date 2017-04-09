/**************************************************************************
 * author : Shilpita Roy
 * date   : April8,2017
 * purpose: Given Binary tree is Isomorphic or not
 * 			Geek4Geeks
 * *****************************************************************************/
public class IsIsomorphicTree {
	
	public static boolean isIsomorphicTree(TreeNode t1, TreeNode t2){
		//BASE CASE1: Both trees are null so they will be isomorphic
		if(t1 == null && t2 == null)
			return true;
		//BASE CASE2: If either one of two tree is null then not isomorphic
		if(t1 == null || t2 == null)
			return false;
		//If the value at the root of either tree are unequal not isomorphic
		if(t1.data != t2.data)
			return false;
		
		// There are two possible cases for t1 and t2 to be isomorphic when following is true of their children
        // Case 1: The subtrees rooted at these nodes have NOT been "Flipped". 
		//		   left child of t1 isomorphic to left child of t2 and same is true for right child of t1 and t2.
        // Case 2: The subtrees rooted at these nodes have been "Flipped".Both of these subtrees have to be isomorphic.
        //		   left child of t1 isomorphic to right child of t2 and same is true for right child of t1 and left child of t2.
		else{
			return (isIsomorphicTree(t1.left, t2.left) && isIsomorphicTree(t1.right,t2.right))
					||(isIsomorphicTree(t1.left,t2.right) && isIsomorphicTree(t1.right,t2.left));
		}
		
	}

	
	
	public static void main(String[] args) {
		/**
		 * This is ISOMORPHIC TREE
		 * 				1                         1
		 * 			  /   \						/   \
		 * 			 2     3                   3 	 2
		 * 		   / \     / 				    \   / \
		 *        4   5   6 					 6  4  5
		 *           / \							  / \
		 *          7   8							 8   7
		 */
		TreeNode t1 = new TreeNode(1);
		TreeNode a  = new TreeNode(2);
		TreeNode b  = new TreeNode(3);
		TreeNode c  = new TreeNode(4);
		TreeNode d  = new TreeNode(5);
		TreeNode e  = new TreeNode(6);
		TreeNode f  = new TreeNode(7);
		TreeNode g  = new TreeNode(8);
		t1.left = a;
		t1.right= b;
		a.left	= c;
		a.right = d;
		d.left  = f;
		d.right = g;
		b.left  = e;
		
		
		TreeNode t2  = new TreeNode(1);
		TreeNode a1  = new TreeNode(2);
		TreeNode b1  = new TreeNode(3);
		TreeNode c1  = new TreeNode(4);
		TreeNode d1  = new TreeNode(5);
		TreeNode e1  = new TreeNode(6);
		TreeNode f1  = new TreeNode(7);
		TreeNode g1  = new TreeNode(8);
		t2.left = b1;
		t2.right= a1;
		a1.left	= c1;
		a1.right= d1;
		d1.left = g1;
		d1.right= f1;
		b1.right= e1;
		
		System.out.println("The Trees t1 and t2 are isomorphic :"+ isIsomorphicTree(t1,t2));
	}

}
