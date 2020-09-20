// A22_constructor.java
import java.util.*;
class Constructor{
	String a,b = "unknown";
	Scanner sc = new Scanner(System.in);
	Constructor(){
		System.out.print("Enter name: ");
		this.a = sc.nextLine();
		System.out.println("-------------------------");
	}
	Constructor(String a, String b){
		this.a = a;
		this.b = b;
	}
	void display(){
		System.out.println("Name1: "+a);
		System.out.println("Name2: "+b);
		System.out.println("------------------------------");
	}
}
class A22_constructor{
	public static void main(String[] args) {
		Constructor c1 = new Constructor();
		Constructor c2 = new Constructor("Ram","Shyam");
		c1.display();
		c2.display();
	}
}