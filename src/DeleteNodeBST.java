/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Feb14,2017
 * Problem: Given a binary tree invert it like mirror image.
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class DeleteNodeBST {
	public static TreeNode findMinChild(TreeNode root){
		TreeNode node = root;
		while(node.left != null)
			node = node.left;
		
		return node;
	}

	public static TreeNode deleteNode(TreeNode root, int key) {
		if(root == null) return root;
		//TreeNode node = root;
		if(root.data > key)
			root.left= deleteNode(root.left,key);
		else if (root.data < key)
			root.right= deleteNode(root.right,key);
		else{
			if(root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;
				
			    TreeNode temp = root.left;
				TreeNode res = findMinChild(root.right);
				//root.right = deleteNode(root.right,res.val);
				root.left = null;
				root = root.right;
				res.left = temp;
				//root.val = res.val;
		}
		return root;
	}
	
	public static void main(String[] args) {
		TreeNode btree = new TreeNode(4);
		btree.left = new TreeNode(2);
		btree.right = new TreeNode(6);
		btree.left.left = new TreeNode(1);
		btree.left.right = new TreeNode(3);
		btree.right.left = new TreeNode(5);
		btree.right.right = new TreeNode(7);

		btree = deleteNode(btree, 3);
		
		System.out.println(IsBST.isBST(btree));
	}

}
