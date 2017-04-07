//import Ex4.General.TreeNode;

public class OddEvenLevelDifference {
	
	public static int getDiff(TreeNode root){
		if(root == null)
			return 0;
		
		return root.data - getDiff(root.left) - getDiff(root.right);
		
	}

	public static void main(String[] args) {
		   /*           50
		    *          /  \
		    *         20   60
		    *        / \     \
		    *       10  25    70
		    *      /  \       / \
		    *     5    15    65  80
		    */
		    TreeNode a = new TreeNode(50);
		    TreeNode b = new TreeNode(20);
		    TreeNode c = new TreeNode(60);
		    TreeNode d = new TreeNode(10);
		    TreeNode e = new TreeNode(25);
		    TreeNode f = new TreeNode(70);
		    TreeNode g = new TreeNode(5);
		    TreeNode h = new TreeNode(15);
		    TreeNode i = new TreeNode(65);
		    TreeNode j = new TreeNode(80);
		    a.left = b;
		    a.right = c;
		    b.left = d;
		    b.right = e;
		    c.right = f;
		    d.left = g;
		    d.right = h;
		    f.left = i;
		    f.right = j;

		    System.out.println(getDiff(a));
		    
	}

}
