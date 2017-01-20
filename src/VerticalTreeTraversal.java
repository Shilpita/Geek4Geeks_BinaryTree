import java.util.*;

/******************************************************************************************************
 * Author : Shilpita Roy
 * Date   : Dec16,2016
 * Problem: Given a binary tree traverse it in vertical order
 *          GeekForGeeks
 *          
 * The time complexity for the best method is O(N). 
 * *****************************************************************************************************/

public class VerticalTreeTraversal {
	private static TreeNode btree ;
	
	private static ArrayList<ArrayList<Integer>> verticalTraversal(TreeNode root){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		
		if(root == null)
			return result;
		
		Queue<TreeNode> nodes = new LinkedList<TreeNode>();
		Queue<Integer> cols = new LinkedList<Integer>();
		
		HashMap<Integer,ArrayList<Integer>> map = new HashMap<Integer,ArrayList<Integer>>();
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		nodes.add(root);
		cols.add(0);
		
		while(!nodes.isEmpty()){
			TreeNode curr = nodes.poll();
			int currcol = cols.poll();
			
			if(!map.containsKey(currcol))
				map.put(currcol, new ArrayList<Integer>());
			
			map.get(currcol).add(curr.data);
			
				
			
			if(curr.left != null){
				nodes.add(curr.left);
				cols.add(currcol-1);
				
				min = Math.min(min, currcol-1);
			}
			
			if(curr.right != null){
				nodes.add(curr.right);
				cols.add(currcol+1);
				
				max = Math.max(max, currcol+1);
			}
				
		}
		
		for(int i= min ; i <= max ; i++)
			result.add(map.get(i));
		
		
		return result;
	}

	public static void main(String[] args) {
		btree = new TreeNode(1);
		btree.left = new TreeNode(2);
		btree.right = new TreeNode(3);
		btree.left.left = new TreeNode(4);
		btree.left.right = new TreeNode(5);
		btree.right.left = new TreeNode(6);
		btree.right.right = new TreeNode(7);
		btree.left.left.left = new TreeNode(8);
		btree.right.left.left = new TreeNode(9);
		
		ArrayList<ArrayList<Integer>> result = verticalTraversal(btree);
		
		System.out.println(result.toString());
		

	}

}
