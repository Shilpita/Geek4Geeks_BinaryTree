/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Dec16,2016
 * Problem: Given a binary tree traverse it in preorder [root->left child->right child]
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

/*Class for tree traversal*/
public class InorderTraversalRecursion {
	public InorderTraversalRecursion(){}
	
	public static void inOrderRecusrsion(TreeNode root){
		if(root == null) return;  
		inOrderRecusrsion(root.left);
		System.out.print(root.data+"\t");
		inOrderRecusrsion(root.right);
	}

	public static void main(String[] args) {
		TreeNode btree = new TreeNode(1);
		btree.left = new TreeNode(2);
		btree.right = new TreeNode(3);
		btree.left.left = new TreeNode(4);
		btree.left.right = new TreeNode(5);
		btree.right.left = new TreeNode(6);
		btree.right.right = new TreeNode(7);
		
		inOrderRecusrsion(btree);
	}

}
