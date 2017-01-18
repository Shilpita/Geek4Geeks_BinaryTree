import java.util.Stack;

/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan15,2017
 * purpose: Postorder Traversal of binary tree 
 * 			Geek4Geeks
 * *****************************************************************************/
public class PostorderTravelIterative {
	private static TreeNode btree;
	
	private static void postorder(){
		if(btree == null || (btree.left == null && btree.right == null))
			System.out.println(btree.data);
		
		TreeNode prev = null;
		Stack<TreeNode> s = new Stack<TreeNode>();
		s.push(btree);
		
		while(!s.isEmpty()){
			TreeNode node = s.peek();
			if(prev == null || prev.left == node || prev.right == node){
			 if(node.left != null){
					s.push(node.left);
					//System.out.println("pushed left child :" +node.left.data);
				}else if(node.right != null){
					s.push(node.right);
					//System.out.println("pushed right child :" +node.right.data);
				}else{
					System.out.print(s.pop().data+"\t");
				}
			}else if(node.left == prev){
				if(node.right != null)
					s.push(node.right);
				else
					System.out.print(s.pop().data+"\t");
		   }else if(node.right == prev){
			   System.out.print(s.pop().data+"\t");
			   if(node.left == null)
				   s.push(node.left);
		   }
		prev = node;	
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

		postorder();
	}

}
