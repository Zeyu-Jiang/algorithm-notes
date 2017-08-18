/**
*print the values of edge nodes
*set the head as the edge node
*set all the leaves as the edge nodes
*in left edge, print the node which is a left child node of its parent node.
*in right edge, print the node which is a right child node of its parent node.
*/
import java.util.*;
class Node{
	int val;
	Node left;
	Node right;

	Node(int val){this.val = val;}

	public static void printEdge(Node root){
		if(root == null) return;

		System.out.print(root.val+" ");
		if(root.left != null && root.right != null){
			printLeftEdge(root.left, true);
			printRightEdge(root.right, true);
		}
		else{
			printEdge(root.left == null? root.right:root.left);
		}
	}

	static void printLeftEdge(Node root, boolean print){
		if(root == null) return;
		if(print || root.left == null && root.right == null)
			System.out.print(root.val+" ");
		printLeftEdge(root.left, print);
		printRightEdge(root.right, print && root.left == null? true:false);
	}

	static void printRightEdge(Node root, boolean print){
		if(root == null) return;
		printRightEdge(root.left, print && root.right == null? true:false);
		printRightEdge(root.right, print);
		if(print || root.left == null && root.right == null)
			System.out.print(root.val+" ");
	}



	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.right.left = new Node(5);
		root.right.right = new Node(6);
		root.left.left.left = new Node(7);
		root.left.left.right = new Node(8);
		root.right.left.left = new Node(9);
		root.right.left.right = new Node(10);
		root.left.left.right.right = new Node(11);
		root.right.left.left.left = new Node(12);
		root.left.left.right.right.left = new Node(13);
		root.left.left.right.right.right = new Node(14);
		root.right.left.left.left.left = new Node(15);
		root.right.left.left.left.right = new Node(16);

		
	}
}