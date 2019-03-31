package LinkedList;

public class RemoveLinkedList1 {

	Node head = null;
	Node current = null;

	void add(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
			// System.out.println(head.data);
		} else {
			current.nextNode = n;
			current = n;
		}
	}

	void remove(int data) {
		Node t=null;
		Node n = head;
		while (n !=null) {
			if (n.data == data) {
				t.nextNode = n.nextNode;
				break;

			}
			t = n;
			n = n.nextNode;
		}
	}

	void display() {
		Node n = head;
		while (n!= null) {
			System.out.println(n.data);
			n = n.nextNode;
		}
		// System.out.println(current.data);
	}
}
