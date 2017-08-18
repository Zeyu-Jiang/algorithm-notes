/**
*preorderRecur and preorderIter  
*inorderRecur and inorderIter
*postorderRecur and postorderIter
*/
import java.util.*;
class Node{
	int val;
	Node left;
	Node right;

	Node(int val){this.val = val;}

	//preorderRecur
	static void preorderRecur(Node root){
		if(root == null) return;
		System.out.print(root.val+" ");
		preorderRecur(root.left);
		preorderRecur(root.right);
	}

	// preorderIter
	static void preorderIter(Node root){
		if(root != null){
			Stack<Node> stack = new Stack<Node>();
			stack.add(root);
			while(!stack.isEmpty()){
				root = stack.pop();
				System.out.print(root.val+" ");
				if(root.right != null) stack.push(root.right);
				if(root.left != null) stack.push(root.left);
			}
		}

	}

	//inorderRecur
	static void inorderRecur(Node root){
		if(root == null) return;
		inorderRecur(root.left);
		System.out.print(root.val+" ");
		inorderRecur(root.right);

	}

	// inorderIter
	static void inorderIter(Node root){
		Node curr = root;
		if(curr != null){
			Stack<Node> stack = new Stack<Node>();
			while(!stack.isEmpty() || curr != null){
				if(curr != null){
					stack.push(curr);
					curr = curr.left;
				}
				else{
					Node node = stack.pop();
					System.out.print(node.val+" ");
					curr = node.right;
				}
			}
		}
	}

	//postorderRecur
	static void postorderRecur(Node root){
		if(root == null) return;
		postorderRecur(root.left);
		postorderRecur(root.right);
		System.out.print(root.val+" ");

	}

	// posterorderIter
	static void posterorderIter(Node root){
		if(root == null) return;
		Stack<Node> temp = new Stack<Node>();
		Stack<Node> output = new Stack<Node>();
		temp.push(root);
		while(!temp.isEmpty()){
			Node node = temp.pop();
			output.push(node);
			if(node.left != null) temp.push(node.left);
			if(node.right != null) temp.push(node.right);
		}

		while(!output.isEmpty()){
			System.out.print(output.pop().val+" ");
		}
	}

	public static void main(String[] args){
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

		posterorderIter(root);
	}
}