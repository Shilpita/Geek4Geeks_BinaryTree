
/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan17,2017
 * purpose: Morris Inorder Traversal of binary tree 
 * 			Geek4Geeks
 * *****************************************************************************/
public class MorrisInorderTraversal {
	private static TreeNode btree;
	
	private static void inorderMorris(TreeNode root){
		if(btree == null || (btree.left == null && btree.right == null))
			System.out.println(btree.data);
		
		TreeNode node = root;
		
		while(node != null){
			if(node.left == null){ ///if no left subtree then print the root and move to the right subtree
				System.out.print(node.data+"\t");
				node = node.right;
			}else{ ///if left subtree exist then find the predecessor of the root to be printed i.e rightmost child of left subtree
				TreeNode predecessor = node.left;
				while(predecessor.right != null && predecessor.right != node) //finding predecessor
					predecessor = predecessor.right;
				
				if(predecessor.right == null){ // if the predecessor found then establish a temp link to the root 
					predecessor.right = node;
					node = node.left;
				}else if(predecessor.right == node){ // if a temp link to root found then remove it and print the root and move to right subtree
					predecessor.right = null;
					System.out.print(node.data +"\t");
					node = node.right;
				}
			}
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
		
		inorderMorris(btree);
	}

}
