//A8_Student.java
class Student{
	int roll_no;
	String name;
	Student(int rn, String nm){
		roll_no = rn;
		name = nm;
	}
	void studentRecordDisplay(Student s){
		System.out.println("Roll number: "+ s.roll_no);
		System.out.println("Name : "+ s.name);
	}
}
class A8_Student{
	public static void main(String args[]){
		Student s1 = new Student(2,"John");
		s1.studentRecordDisplay(s1);
	}
}