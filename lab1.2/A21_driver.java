// A21_driver.java
class Student{
	int rollno; String name;
	Student(int a, String b){
		this.rollno = a;
		this.name = b;
		System.out.println("NAME: "+name);
		System.out.println("ROLL_NO: "+rollno);
	}
}
class A21_driver{
	public static void main(String[] args) {
		Student s = new Student(128,"BIKRAM BHURTEL");
	}
}