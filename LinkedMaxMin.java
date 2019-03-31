package LinkedList;

public class LinkedMaxMin {
	
	Node head=null;
	Node current=null;
	Node old=null;
	
	void add(int data) {
		Node n=new Node();
		n.data=data;
		if(head==null) {
			head=n;
			current=n;
		}else {
			current.nextNode=n;
			old=current;
			current=n;		
		}
	}
	
	int max(){
		//int size=0;
		int max=head.data;
		Node temp=head;
		while(temp!=null) {
			if(temp.data>max) {
				max=temp.data;
				
			}temp=temp.nextNode;
		}
		return max;
		
	}
	
	int min() {
		//int size=0;
		int min=head.data;
		Node temp=head;
		while(temp!=null) {
			if(temp.data<min) {
				min=temp.data;
				
			}temp=temp.nextNode;
		}
		return min;
		
	}
	void display() {
		Node n=head;
		while(n!=null) {
			System.out.println(n.data);
			n=n.nextNode;
		}
	}

}
