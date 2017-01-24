
public class FindDiameterTree {
	private static TreeNode btree;
	
	private static int getHeight(TreeNode root){
		if(root == null) return 0;
		TreeNode node = root;
		return 1+ (getHeight(node.left) > getHeight(node.right)?getHeight(node.left) : getHeight(node.right));
	}
	
	public static int getDiameter(TreeNode root){
		if(root == null) return 0;
		
		int rootDiameter = getHeight(root.left)+getHeight(root.right)+1;
		int leftDiameter = getDiameter(root.left);
		int rightDiameter= getDiameter(root.right);
		
		return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
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

		System.out.println("The diameter of the tree is : "+ getDiameter(btree));
	}

}
