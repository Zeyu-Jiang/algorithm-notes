/**
*The function is merge sort for linked list.
*Basicially, the process has three steps.
*1. divide the original linked list into groups of one linkedlist or two linkedlist groups.(get middle function)
*2.sort and merege the elements of each linkedlist group. then return a sorted linkedlist for another sort and merege. ) (sorted merge function)
*/
class Node{
	int val;
	Node next;

	Node(int val){this.val = val;}

	// this is the main function block. 
	static Node mergeSort(Node head){
		if(head == null|| head.next == null) return head;

		Node middleNode = getMiddle(head);
		Node secondHalf = middleNode.next;
		middleNode.next = null;

		Node left = mergeSort(head);
		Node right = mergeSort(secondHalf);

		Node headHead = sortedMerge(left, right);
		return headHead;
	}
	// step  compare two nodes and sort them.
	static Node sortedMerge(Node left, Node right){
		Node result = null; //this is a head head.

		if(left == null) return right;
		if(right == null) return left;

		if(left.val <= right.val){
			result = left;
			result.next = sortedMerge(left.next, right);
		}
		else{
			result = right;
			result.next = sortedMerge(left, right.next);
		}
		return result;
	}

	// step divid the original linked list into a group of linkedlist group which has either one or two elements.
	static Node getMiddle(Node head){
		if(head == null || head.next == null) return head;
		Node ptr1 = head; // slow pointer.
		Node ptr2 = head.next; // fast pointer.

		while(ptr2 != null){
			ptr2 = ptr2.next;
			if(ptr2 != null){
				ptr1 = ptr1.next;
				ptr2 = ptr2.next;
			}
		}
		return ptr1;
	}

	public static void main(String[] args){
		Node head = new Node(6);
		head.next = new Node(5);
		head.next.next = new Node(1);
		head.next.next.next = new Node(3);
		head.next.next.next.next = new Node(7);
		head.next.next.next.next.next = new Node(8);

		Node dummy = mergeSort(head);

		while(dummy != null){
			System.out.print(dummy.val + " ");
			dummy = dummy.next;
		}
	}
}