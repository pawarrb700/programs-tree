package tree_structure;

public class TreeNode<E> {

	private E data;

	private TreeNode<E> leftNode;
	
	private TreeNode<E> rightNode;
	
	public void setData(E data) {
		this.data = data;
	}

	public void setLeftNode(TreeNode<E> leftNode) {
		this.leftNode = leftNode;
	}

	public void setRightNode(TreeNode<E> rightNode) {
		this.rightNode = rightNode;
	}
	
	public E getData() {
		return data;
	}

	public TreeNode<E> getLeftNode() {
		return leftNode;
	}

	public TreeNode<E> getRightNode() {
		return rightNode;
	}

	public TreeNode(E data, TreeNode<E> leftNode, TreeNode<E> rightNode) {
		super();
		this.data = data;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}
	
	@Override
	public String toString() {
		return data.toString();
		
	}
}
