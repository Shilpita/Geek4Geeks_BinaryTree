
public class LowestCommonAncesstor {

	public static TreeNode findLCA(TreeNode node, int n1 , int n2){
		if(node == null) return null;
		
		if(node.data == n1 || node.data == n2)
			return node;
		
		TreeNode leftLCA = findLCA(node.left,n1,n2);
		TreeNode rightLCA= findLCA(node.right,n1,n2);
		
		if(leftLCA != null && rightLCA != null)
			return node;
		
		return (leftLCA != null)? leftLCA:rightLCA;
	}
	
	
	public static void main(String[] args) {
		TreeNode btree = new TreeNode(1);
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
		
		System.out.println(findLCA(btree, 5, 11).data);

	}

}
