//Rotate List. but this script cannot work on leetcode.
class ListNode{
	int val;
	ListNode next;

	ListNode(int val){this.val = val;}

	public ListNode rotateRight(ListNode head, int k){
		if(head == null || head.next == null) return head;
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode ptr1 = head;
		ListNode ptr2 = head;

		int count = 0;
		while(count < k){
			ptr2 = ptr2.next;
			count++;
		}

		while(ptr2.next != null){
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}

		ptr2.next = dummy.next; // link the original end to the original start.
        dummy.next = ptr1.next; // create a new start node.
        ptr1.next = null;
		
		return dummy.next;
	}

	public static void main(String[] argd){
		ListNode head = new ListNode(0);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		head.next.next.next.next.next.next = new ListNode(6);
		head.next.next.next.next.next.next.next = new ListNode(7);

		head = head.rotateRight(head,2);
		while(head != null){
			System.out.print(head.val+" ");
			head = head.next;
		}
		System.out.println();

	}
}