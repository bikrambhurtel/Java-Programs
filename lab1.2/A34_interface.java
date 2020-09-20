// A34_interface.java
interface Java{
	String name1 = "Advanced Java Programming";
	public void show1();
}
interface Adbms{
	String name2 = "Advanced Database Management System";
	public void show2();
}
class Student implements Java, Adbms{
	public void display(){
		System.out.println("I study:\n------------------");
	}
	public void show1(){
		System.out.println("Subject 1: "+name1);
	}
	public void show2(){
		System.out.println("Subject 2: "+name2);
	}
}

class A34_interface{
	public static void main(String[] args){
		Student s = new Student();
		s.display(); s.show1(); s.show2();
	}
}