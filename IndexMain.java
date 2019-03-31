package LinkedList;

public class IndexMain {
	public static void main(String[] args) {
		
		IndexRem ir=new IndexRem();
		ir.add(20);
		ir.add(40);
		ir.add(50);
		ir.add(60);
		ir.add(70);
		ir.display();
		System.out.println("After deleting numbers");
		ir.remove(2);
		ir.remove(5);
		ir.display();
	}

}
