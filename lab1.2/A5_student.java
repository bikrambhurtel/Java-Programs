//A5_student.java
class Student{
	String name;
	Student(){
		name = "unknown";
	}
	Student(String n){
		name = n;
	}
	void printName(Student s){
		System.out.println("student name: "+s.name);
	}
}
class A5_student{
	public static void main(String args[]){
		Student s1 = new Student();
		Student s2 = new Student("Bikram Bhurtel");
		s1.printName(s1);
		s2.printName(s2);
	}
}