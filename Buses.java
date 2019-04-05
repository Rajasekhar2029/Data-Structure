package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Buses {
	
	List<Bus> bus=new ArrayList<>();
	
	void getBuses() {
		
		/*
		 * Scanner sc=new Scanner(System.in);
		 * 
		 * String busname=sc.nextLine(); long busno=sc.nextLong(); String
		 * bustypt=sc.nextLine(); String resource=sc.nextLine(); String
		 * destination=sc.nextLine();
		 */		
		
		
		  Bus b=new Bus();
		 
		  b.busname="APSRTC"; 
		  b.busno=1256; 
		  b.bustype="A.C Sleeper";
		  b.resource="Benglure"; 
		  b.destination="Hyderabad"; b.fare="750";
		  b.totalseat="35+2";
		  b.BS=new PassenagerAddress();
		  b.BS.name="Tarak";
		  b.BS.age=25;
		  b.BS.gender="Male";
		  b.BS.mailid="Raja@gmail.com";
		  b.BS.phnum=740122610;
		 	
		
		  Bus b1=new Bus(); 
		  b1.busname="SRS"; 
		  b1.busno=1245; 
		  b1.bustype="A.C Sleeper";
		  b1.resource="Bengulure"; 
		  b1.destination="Vijayawada"; 
		  b1.fare="1130";
		  b1.totalseat="35+2";
		  b1.BS=new PassenagerAddress();
		  b1.BS.name="Sam";
		  b1.BS.age=57;
		  b1.BS.gender="Male";
		  b1.BS.mailid="Sam@gmail.com";
		  b1.BS.phnum=789456123;
		 //return getBuses();
		 	
		
		  bus.add(b); bus.add(b1);
		 
	}
		void display() {
			
			
			
			for(Bus bs:bus) {
				System.out.println("Bus Name:" +bs.busname);
				System.out.println("Bus No:" +bs.busno);
				System.out.println("Bus Type:" +bs.bustype);
				System.out.println("Bus Resource:" +bs.resource);
				System.out.println("Bus Destination:" +bs.destination);
				System.out.println("Bus Fare:" +bs.fare);
				System.out.println("Bus Total Seats:" +bs.totalseat);
				System.out.println("Passenger Name:" +bs.BS.name);
				System.out.println("Passenger Age:" +bs.BS.age );
				System.out.println("Passenger Gender:" +bs.BS.gender);
				System.out.println("Passenger Mail ID:" +bs.BS.mailid);
				System.out.println("Passenger Phone Number:" +bs.BS.phnum);
				System.out.println("--------------------------");
			}
		
		
	}
}
