package LinkedList;

public class LinkedMaxMinMain {
	public static void main(String[] args) {
		LinkedMaxMin lm=new LinkedMaxMin();
		lm.add(1);
		lm.add(5);
		lm.add(15);
		lm.add(25);
		lm.add(30);
		lm.add(40);
		lm.add(45);
		lm.display();
		System.out.println("Maximum value:"+ lm.max());
		System.out.println("Minimum value:"+ lm.min());
	}
}
