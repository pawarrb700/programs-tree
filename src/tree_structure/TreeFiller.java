package tree_structure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeFiller<E> {
	
	TreeNode<E> tree;
	
	public TreeNode<E> addNode(E... values) {
		for(int i=0;i<values.length;i++) {
			addNode(values[i]);
		}
		return tree;
	}
	
	public void addNode(E nodeValue) {
		if(tree == null) {
			tree = new TreeNode<E>(nodeValue, null, null);
		} else {
			TreeNode<E> currentNode = null;
			List<TreeNode<E>> nodeHolder = new ArrayList<>();
			nodeHolder.add(tree);
			while(!nodeHolder.isEmpty()) {
				currentNode = nodeHolder.remove(0);
				if(currentNode.getLeftNode()==null || currentNode.getRightNode() == null) {
					break;
				} else {
					if(currentNode.getLeftNode()!=null){
						nodeHolder.add(currentNode.getLeftNode());
					} 
					if(currentNode.getRightNode()!=null) {
						nodeHolder.add(currentNode.getRightNode());
					}
				}
			}
			if(currentNode.getLeftNode()==null && currentNode.getRightNode()==null) {
				TreeNode<E> leftNode = new TreeNode<E>(nodeValue, null, null);
				currentNode.setLeftNode(leftNode);
			} else if(currentNode.getLeftNode()!=null && currentNode.getRightNode()==null) {
				TreeNode<E> rightNode = new TreeNode<E>(nodeValue, null, null);
				currentNode.setRightNode(rightNode);
			}
		}
	}
}
