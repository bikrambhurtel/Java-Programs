// A20_driver.java
class Student{
	int rollno; String name;
	void info(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
	}
	void displayInfo(){
		System.out.println("Name: "+name);
		System.out.println("roll_no.: "+rollno);
	}
}
class A20_driver{
	public static void main(String args[]){
		Student st = new Student();
		st.info(128, "Bikram Bhurtel");
		st.displayInfo();
	}
}