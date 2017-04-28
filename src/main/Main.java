package main;

import java.util.Scanner;

import tree_structure.TreeFiller;
import tree_structure.TreeNode;
import tree_traversal.TreeTraversals;

/**
 * Main class for running tree operations.
 * 
 * @author rahulpawar
 */
public class Main {

	public static void main(String[] args) {
		/*
		 * Insertion in tree : Nodes will be inserted from left to right order.
		 * Starting from root, left node will get filled followed by right node.
		 */
		TreeFiller<Integer> treeFiller = new TreeFiller<>();
		TreeNode<Integer> tree = treeFiller.addNode(2, 5, 7, 9, 11, 10, 21);
		
		System.out.println("Options :\n1.Inorder traversal using recursion.\n2. Exit");
		System.out.println("Please Enter your option :");
		Scanner s = new Scanner(System.in);
		
		while(true) {
			int option = s.nextInt();
			switch(option) {
				case 1 : 
					TreeTraversals.inorderTraversal(tree);
					break;
				case 2 :
					break;
			}
		}
	}
}
