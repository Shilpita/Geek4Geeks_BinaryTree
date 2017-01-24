import java.util.*;

/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan20,2017
 * purpose: Find Width of binary tree (Recursive)
 * 			Geek4Geeks
 * *****************************************************************************/
public class FindWidthTree {
	private static TreeNode btree;
	/** Counting the Maximum width using level order traversal technique.
	 * At each level get the size of the queue and push the nodes on next level.
	 * @param root
	 * @return
	 */
	private static int getWidth(TreeNode root){
		if(root == null) return 0;
		int maxwidth = 0;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(!q.isEmpty()){
			int width = q.size();
			maxwidth = maxwidth > width? maxwidth: width;
			
			while(width > 0){
				TreeNode node = q.remove();
				width--;
				if(node.left!= null)
					q.add(node.left);
				if(node.right!= null)
					q.add(node.right);
			}
			
		}
		return maxwidth;
	}
	
	public static void main(String[] args) {
		btree = new TreeNode(1);
		btree.left = new TreeNode(2);
		btree.right = new TreeNode(3);
		btree.left.left = new TreeNode(4);
		btree.left.right = new TreeNode(5);
		btree.left.right.right = new TreeNode(8);
		btree.left.right.left = new TreeNode(12);
		btree.right.left = new TreeNode(6);
		btree.right.right = new TreeNode(7);
		btree.right.right.left = new TreeNode(10);
		btree.right.right.right = new TreeNode(13);
		btree.right.right.left.right = new TreeNode(9);
		btree.right.right.left.left = new TreeNode(11);
		
		System.out.println("The max width of the tree : "+ getWidth(btree));
	}

}
