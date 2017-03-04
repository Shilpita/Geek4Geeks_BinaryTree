import java.util.*;

/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Feb10,2017
 * Problem: Given a binary tree invert it like mirror image.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class InvertBinaryTree {
	/**
	 * RECURSIVE APPROACH 
	 * @param root
	 * @return
	 */
	public static TreeNode invertTreeRecursion(TreeNode root){
		if(root == null) return root;
		TreeNode left = root.left;
		TreeNode right= root.right;
		
		root.left = invertTreeRecursion(right);
		root.right= invertTreeRecursion(left);
		
		return root;
	}
	
	public static TreeNode invertTreeIterative(TreeNode root){
		if(root == null) return root;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode t = queue.poll();
			TreeNode temp = t.left;
			t.left = t.right;
			t.right= temp;
			
			if(t.left != null) queue.add(t.left);
			if(t.right!= null) queue.add(t.right);
		}
		return root;
	}
	

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		TreeNode btree = new TreeNode(1);
		btree.left = new TreeNode(2);
		btree.right = new TreeNode(3);
		btree.left.left = new TreeNode(4);
		btree.left.right = new TreeNode(5);
		btree.right.left = new TreeNode(6);
		btree.right.right = new TreeNode(7);
		
		InorderTraversalRecursion inorder = new InorderTraversalRecursion();
		inorder.inOrderRecusrsion(btree);
		
		TreeNode root = invertTreeRecursion(btree);
		System.out.println();
		inorder.inOrderRecusrsion(root);
		
		root = invertTreeIterative(root);
		System.out.println();
		inorder.inOrderRecusrsion(root);
		
		
	}

}
