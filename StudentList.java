package Collections;

import java.util.*;

public class StudentList {
	
	private Object StudentList;
	List<Student> sl=new ArrayList<>();
	void getStudentList() {

	
	Student s=new Student();
	s.id=123;
	s.name="Chiru";
	s.age=26;
	s.gender="Male";
	s.section="B.tech";
	s.add=new Address();
	s.add.doorno="3-519";
	s.add.flatno="F1";
	s.add.streetName="Karnala";
	s.add.city="SKHT";
	
	Student s1=new Student();
	s1.id=124;
	s1.name="Siva";
	s1.age=26;
	s1.gender="Male";
	s1.section="BDS";
	s1.add=new Address();
	s1.add.doorno="4-519";
	s1.add.flatno="F4";
	s1.add.streetName="Bazzar";
	s1.add.city="SKHT";
	
	sl.add(s);
	sl.add(s1);
	
	
	}
	
	
		void display() {
			//Student ss=StudentList.get(0);
			//System.out.println(ss.id);
			for(Student stu:sl) {
				System.out.println("Student Id:" +stu.id);
				System.out.println("Student Name:" +stu.name);
				System.out.println("Student Age:" +stu.age);
				System.out.println("Student Gender:" +stu.gender);
				System.out.println("Student Section:" +stu.section);
				System.out.println("Student Door no:" +stu.add.doorno);
				System.out.println("Student Flat no:" +stu.add.flatno);
				System.out.println("Student Street:" +stu.add.streetName);
				System.out.println("Student City:" +stu.add.city);
				System.out.println("---------------------------------");
	
			}
}
}