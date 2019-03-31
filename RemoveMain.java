package LinkedList;

public class RemoveMain {
	public static void main(String[] args) {
		RemoveLinkedList1 rl=new RemoveLinkedList1();
		rl.add(12);
		rl.add(28);
		rl.add(32);
		rl.display();
		System.out.println("Present Elements");
		rl.remove(28);
		rl.display();
	}

}
