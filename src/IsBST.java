/**************************************************************************
 * author : Shilpita Roy
 * date   : Jan13,2017
 * purpose: Given Binary tree is BST or Not
 * 			Geek4Geeks
 * *****************************************************************************/
public class IsBST {
	/*****BRUTE FORCE METHOD :INEFFIECIENT *******/
	public static int maxNode(TreeNode node){
		while(node==null) return 0;
		TreeNode temp = node;
		while(temp.left!= null){
			temp = temp.left;
		}
		return temp.data;
	}
	
	public static int minNode(TreeNode node){
		while(node==null) return 0;
		TreeNode temp = node;
		while(temp.right!= null){
			temp = temp.right;
		}
		return temp.data;
	}
	
	public static boolean isBST(TreeNode node){
		if(node == null) return true;
		
		if(node.left!= null && maxNode(node.left) > node.data){
			System.out.println("left child greater"+ maxNode(node.left) +"and"+ node.data);
			return false;
		}
		if(node.right!= null && minNode(node.right) <= node.data){
			System.out.println("right child smaller");
			return false;
		}
		if(!isBST(node.left) || !isBST(node.right)){
			System.out.println("is child bst:"+ isBST(node.left) +" and "+ isBST(node.right));
			return false;
		}
			
		
		return true;
	}
	
	/********EFFIECIENT SOLUTION*********/
	public static boolean isBSTEffiecient(TreeNode node){
		if(node == null) return true;
		
		return isBSTHandler(node, Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	
	private static boolean isBSTHandler(TreeNode node, int minValue, int maxValue) {
		if(node == null) return true;
		if(minValue < node.data && node.data < maxValue){
			//System.out.println(isBSTHandler(node.left,minValue,node.data)+"   "+ isBSTHandler(node.right,node.data,maxValue));
			return isBSTHandler(node.left,minValue,node.data) &&
					isBSTHandler(node.right,node.data,maxValue);
		}
		return false;
	}

	public static void main(String[] args) {
		TreeNode btree = new TreeNode(4);
		btree.left = new TreeNode(2);
		btree.right = new TreeNode(6);
		btree.left.left = new TreeNode(1);
		btree.left.right = new TreeNode(3);
		btree.right.left = new TreeNode(5);
		btree.right.right = new TreeNode(7);
		
		System.out.println(isBST(btree));
		System.out.println(isBSTEffiecient(btree));

	}

}
