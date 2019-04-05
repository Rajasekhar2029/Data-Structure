package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Itarater {

	public static void main(String[] args) {
		
		List<String> user=new ArrayList<String>();
		user.add("Leela");
		user.add("Sam");
		user.add("Raj");
		user.add("Yasu");
		
		for(String x:user) {
			System.out.println("Using for loop:" +x);
		}
		System.out.println("--------------------------");
		
		Iterator it= user.iterator();
		while(it.hasNext()) {
			String s=(String) it.next();
			System.out.println("Using Iterator connecpt:" +s);
		}
	}
}
