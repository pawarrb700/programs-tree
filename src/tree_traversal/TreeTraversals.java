package tree_traversal;

import tree_structure.TreeNode;

public class TreeTraversals {

	public static <E> void inorderTraversal(TreeNode<E> root) {
		if(root.getLeftNode()!=null) {
			inorderTraversal(root.getLeftNode());
		}
		System.out.print(root + " ");
		if(root.getRightNode()!=null) {
			inorderTraversal(root.getRightNode());
		}
	}
}
