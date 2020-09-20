// A19_driver.java
class Student{
	String name; int roll_no;
	Student(int roll_no, String name){
		this.name = name;
		this.roll_no = roll_no;
	}
	void displayStudent(){
		System.out.println("Name: "+name);
		System.out.println("Roll no.: "+roll_no);
	}
}
class A19_driver{
	public static void main(String[] args) {
		Student st = new Student(128,"Bikram Bhurtel");
		st.displayStudent();
	}
}