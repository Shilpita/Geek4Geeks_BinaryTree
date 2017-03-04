/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Feb9,2016
 * Problem: Given a binary tree and a key value print all the ancesstors of the key
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/


public class PrintAncestorBSTRecursion {
	public static boolean printAncestor(TreeNode node , int key){
		if(node == null) return false;
		if(node.data == key) return true;
		else{
			if(printAncestor(node.left, key) || printAncestor(node.right, key)){
				System.out.print(node.data +"\t");
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		TreeNode btree = new TreeNode(1);
		btree.left = new TreeNode(2);
		btree.right = new TreeNode(3);
		btree.left.left = new TreeNode(4);
		btree.left.right = new TreeNode(5);
		btree.right.left = new TreeNode(6);
		btree.right.right = new TreeNode(7);

		printAncestor(btree, 7);
	}

}
