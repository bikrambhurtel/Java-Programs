//A9_student.java
class Student{
	int roll_no;
	String name, address, phone_no;
	Student(String nm, int rn, String ad, String ph){
		address = ad;
		phone_no = ph;
		roll_no = rn;
		name = nm;
	}
	void studentRecordDisplay(Student s){
		System.out.println("Name : "+ s.name);
		System.out.println("Roll number: "+ s.roll_no);
		System.out.println("Address: "+ s.address);
		System.out.println("Phone number: "+ s.phone_no);
		System.out.println("------------------------------------");
	}
}
class A9_student{
	public static void main(String args[]){
		Student s1 = new Student("Sam",1,"Baker-Street-714,London","+1 98204967382");
		Student s2 = new Student("John",2,"Chabahil-7,Kathmandu","+977 9843759398");
		s1.studentRecordDisplay(s1);
		s2.studentRecordDisplay(s2);
	}
}