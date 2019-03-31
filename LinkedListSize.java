package LinkedList;

public class LinkedListSize {
	
	Node head=null;
	Node current=null;
	
	void add(int data) {
		Node n=new Node();
		n.data=data;
		if(head==null) {
			head=n;
			current=n;
		}else {
			current.nextNode=n;
			current=n;
			
		}
	}

	int size() {
		int s=0;
		Node temp=head;
		while(temp!=null) {
			s++;
			temp=temp.nextNode;
		}
		return s;
	}
	
	void display() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.nextNode;
		}
	}
}
