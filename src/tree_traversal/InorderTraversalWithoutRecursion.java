package tree_traversal;

import tree_structure.TreeFiller;
import tree_structure.TreeNode;

public class InorderTraversalWithoutRecursion {

	public static void main(String args[]) {
		TreeFiller<Integer> treeFiller = new TreeFiller<>();
		TreeNode<Integer> tree = treeFiller.addNode(2, 5, 7, 9, 11, 10, 21);
		
		System.out.println("Inorder Traversal :");
		TreeTraversals.inorderTraversal(tree);
	}
}
