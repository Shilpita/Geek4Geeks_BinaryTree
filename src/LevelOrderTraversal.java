import java.util.LinkedList;
import java.util.Queue;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Dec16,2016
 * Problem: Given a binary tree traverse it in level order
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

/* Class for travelsal.*/
public class LevelOrderTraversal {
	
	public LevelOrderTraversal(){}
	/*
	 * This method uses a Queue to enqueue child of each TreeNode visited and prints the popped head of queue
	 */
	public static void levelTraversal(TreeNode root){
		if(root == null) System.out.println("no tree");
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode temp = queue.poll();
			System.out.print(temp.data+"\t");
			if(temp.left != null)
				queue.add(temp.left);
			if(temp.right != null)
				queue.add(temp.right);	
		}	
	}
	
	public static void main(String[] args) {
		TreeNode btree = new TreeNode(1);
		btree.left = new TreeNode(2);
		btree.right = new TreeNode(3);
		btree.left.left = new TreeNode(4);
		btree.left.right = new TreeNode(5);
		btree.right.left = new TreeNode(6);
		btree.right.right = new TreeNode(7);
		
		levelTraversal(btree);
		
	}

}
