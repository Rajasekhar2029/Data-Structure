package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class SStudentDemo {

	static HashMap<Integer, String> hm = new HashMap<Integer, String>();

	<K> void getSStudentDemo() {
		System.out.println("Initial list of elements: " + hm);

		hm.put(101, "Raj");
		hm.put(102, "Sekhr");
		hm.put(103, "Addanki");
		hm.put(105, "Yashwanth");
		hm.put(106, "Thyga");
		hm.put(107, "null");
		System.out.println("Initial list of elements: " + hm);
		System.out.println("-----------------");

		hm.put(108, "Sam");
		hm.put(109, "Puni");
		System.out.println("Updated list of elements: " + hm);
		System.out.println("------------------");
		hm.remove(103);
		hm.put(112, null);
		System.out.println("After removimg the elements:" + hm);
		System.out.println("------------------");
		String s = hm.get(2);

	}

	void mapentry() {

		for (Map.Entry entry : hm.entrySet()) {
			Object i = entry.getKey();
			Object s = entry.getValue();
			System.out.println(i + "_" + s);

		}
		System.out.println("------------------");
	}

	void Integer() {
		for (Integer i : hm.keySet()) {
			String s = hm.get(i);
			System.out.println(i + "_" + s);

		}
		System.out.println("------------------");
	}


	public static void main(String[] args) {

		SStudentDemo ss = new SStudentDemo();

		ss.getSStudentDemo();
		Iterator it = hm.keySet().iterator();
		while (it.hasNext()) {
			Object i = it.next();
			String s = hm.get(i);
			System.out.println(i + "_" + s);
			ss.Integer();
			ss.mapentry();
		}

	}

}
