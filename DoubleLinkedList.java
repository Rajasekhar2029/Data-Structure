package LinkedList;

public class DoubleLinkedList {

	Node1 head = null;
	Node1 current = null;

	void add(int data) {
		Node1 n = new Node1();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
			// System.out.println(head.data);
		} else {
			current.nextnode = n;
			n.previousNode = current;
			current = n;
			// n.nextnode=head;
			// head.nextnode=n;
		}
	}

	// void remove() {
	// Node1 n = head;
	// while (n.nextnode != null) {
	// n = n.nextnode;
	// } }

	void display() {
		Node1 n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.nextnode;
		}
	}
}
