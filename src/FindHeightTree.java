/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan20,2017
 * purpose: Find Height of binary tree (Recursive)
 * 			Geek4Geeks
 * *****************************************************************************/
public class FindHeightTree {
	private static TreeNode btree;
	
	private static int getHeight(TreeNode root){
		if(root == null) return 0;
		
		TreeNode node = root;

        int depth_left = getHeight(node.left) +1;
        int depth_right= getHeight(node.right) +1;
        
		return depth_left > depth_right?depth_left : depth_right;
	}
	
	public static void main(String[] args) {
		btree = new TreeNode(1);
		btree.left = new TreeNode(2);
		btree.right = new TreeNode(3);
		btree.left.left = new TreeNode(4);
		btree.left.right = new TreeNode(5);
		btree.left.right.right = new TreeNode(8);
		btree.right.left = new TreeNode(6);
		btree.right.right = new TreeNode(7);
		btree.right.right.left = new TreeNode(10);
		btree.right.right.left.right = new TreeNode(9);
		
		System.out.println("The height of the tree : "+ getHeight(btree) );
	}

}
