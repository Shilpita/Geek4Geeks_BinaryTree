import java.util.Stack;

/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan15,2017
 * purpose: Preorder Traversal of binary tree 
 * 			Geek4Geeks
 * *****************************************************************************/
public class PreorderTravelIterative {
	private static TreeNode btree;
	
	private static void preorder(){
		if(btree == null || (btree.left == null && btree.right == null))
			System.out.println(btree.data);
		
		TreeNode node ;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(btree);
		
		while(!s.isEmpty()){
			node = s.pop();
			System.out.print(node.data+"\t");
			
			if(node.right != null)
				s.push(node.right);
			if(node.left != null)
				s.push(node.left);
			
		}
		
	}
	public static void main(String[] args) {
		btree = new TreeNode(4);
		btree.left = new TreeNode(2);
		btree.right = new TreeNode(6);
		btree.left.left = new TreeNode(1);
		btree.left.right = new TreeNode(3);
		btree.right.left = new TreeNode(5);
		btree.right.right = new TreeNode(7);

		preorder();
	}

}
