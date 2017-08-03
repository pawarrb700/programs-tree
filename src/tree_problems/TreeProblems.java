package tree_problems;

import tree_structure.TreeNode;

public class TreeProblems<T> {

	public static<T> int getNumberOfNodesWithValueLessThanValueOfUpperNodes(final TreeNode<T> root) {
		return root == null ? 0 : findNodeWithLessValueThanParent(root, root.getData());
	}
	
	public static<T> int findNodeWithLessValueThanParent(final TreeNode<T> node, final T value) {
		if(node==null) {
			return 0;
		}
		if(value instanceof Comparable && node.getData() instanceof Comparable) {
			if(((Comparable<T>) node.getData()).compareTo(value) < 0) {
				return 1 + findNodeWithLessValueThanParent(node.getLeftNode(), node.getData()) + findNodeWithLessValueThanParent(node.getRightNode(), node.getData());				
			} else {
				return 0 + findNodeWithLessValueThanParent(node.getLeftNode(), node.getData()) + findNodeWithLessValueThanParent(node.getRightNode(), node.getData());
			}
		} else {				
			throw new IllegalArgumentException("Values passed does not override comparable.");
		}
	}
}
