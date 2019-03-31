package LinkedList;

public class LinkedList{
	
	Node head=null;
	Node current=null;
	
	void push(int data) {
		
		Node n=new Node();
		n.data=data;
		if(head==null) {
			head=n;
			current=n;
			System.out.println(head.data);
		}else {
			current.nextNode=n;
			current=n;
		}
		
	
	}
	void display() {
		Node n1=head;
		while(n1.nextNode!=null) {
			System.out.println(n1.data);
			n1=n1.nextNode;
			}
		System.out.println(current.data);
	}
	

}
