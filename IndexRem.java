package LinkedList;

public class IndexRem {

	Node head = null;
	Node current = null;

	void add(int data) {
		Node n = new Node();
		n.data = data;
		if (head == null) {
			head = n;
			current = n;
		} else {
			current.nextNode = n;
			current = n;
		}
	}

	void remove(int i) {

		int index=1;
		Node t = head;
		Node n = head;
		while (n != null) {
			if (index == i) {
				head=head.nextNode;
			//t.nextNode = n.nextNode;
				break;
			}
			t = n;
			n = n.nextNode;
			index++;
		}
	}

	void display() {
		Node n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.nextNode;

		}
	}
}
