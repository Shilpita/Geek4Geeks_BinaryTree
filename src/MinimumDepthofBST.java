/**************************************************************************
 * author : Shilpita Roy
 * date   : Feb15,2017
 * purpose: Find Minimum Height or Depth of binary tree (Recursive)
 * 			Geek4Geeks
 * *****************************************************************************/
public class MinimumDepthofBST {
	
    public static int minDepth(TreeNode root) {
        if(root == null) return 0;
        TreeNode node = root;
        if(node.right == null) return minDepth(node.left)+1;
        if(node.left == null) return minDepth(node.right)+1;
        
        return Math.min(minDepth(node.left), minDepth(node.right))+1;
    }
	public static void main(String[] args) {
		TreeNode btree = new TreeNode(1);
		btree.left = new TreeNode(2);
		btree.right = new TreeNode(3);
		//btree.left.left = new TreeNode(4);
		//btree.left.right = new TreeNode(5);
		//btree.left.right.right = new TreeNode(8);
		btree.right.left = new TreeNode(6);
		btree.right.right = new TreeNode(7);
		btree.right.right.left = new TreeNode(10);
		//btree.right.right.left.right = new TreeNode(9);
		
		System.out.println("The minimum height of the tree : "+ minDepth(btree) );

	}

}
