import java.util.*;
import java.util.Queue;
/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Dec16,2016
 * Problem: Given a binary tree traverse it in reverse level order
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/


public class ReverseLevelOrderTraversal {
	
	public ReverseLevelOrderTraversal(){}
	/*
	 * This method uses a Queue to enqueue child of each TreeNode visited. The is level order traversal
	 * Then each node from the queue is added to the stack.
	 * Thus when each node is poped from stack its in reverse order of level traversal.
	 */
	public static void reverseLevelTraversal(TreeNode root){
		if(root == null) System.out.println("no tree");
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty()){
			TreeNode temp = queue.poll();
			stack.push(temp);
			//System.out.print(temp.data+"\t");
			if(temp.right != null)
				queue.add(temp.right);	
			if(temp.left != null)
				queue.add(temp.left);
		}
		
		while(!stack.isEmpty())
			System.out.print(stack.pop().data +"\t");
	}
	
	public static void main(String[] args) {
		TreeNode btree = new TreeNode(1);
		btree.left = new TreeNode(2);
		btree.right = new TreeNode(3);
		btree.left.left = new TreeNode(4);
		btree.left.right = new TreeNode(5);
		btree.right.left = new TreeNode(6);
		btree.right.right = new TreeNode(7);
		
		reverseLevelTraversal(btree);
		
	}

}
