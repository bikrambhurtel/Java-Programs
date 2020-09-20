//A1_student.java
class Student{
	int id;
	String name;
	Student(){
		
	}
	//Data initialization using constructor
	Student(int st_id, String st_name){
		id = st_id;
		name = st_name;
	}
	//Data initialization using member function
	void studentrecord(int id, String name){
		System.out.println("id: "+id);
		System.out.println("name: "+name);
	}
	//Data initialization using reference
	void display(Student st){
		System.out.println("id: "+st.id);
		System.out.println("name: "+st.name);
	}
	
}
class A1_student{
	public static void main(String args[]){
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student(128, "Bikram Bhurtel");
		st1.id = 114;
		st1.name = "Rabin Shrestha";
		st3.display(st3);
		System.out.println("================================");
		st2.studentrecord(111, "Anil Pokhrel");
		System.out.println("================================");
		System.out.println("id: "+st1.id);
		System.out.println("name: "+st1.name);
		System.out.println("================================");
	}
}