// A16_area.java
import java.util.*;
class Rectangle{
	int length, breadth;
	Rectangle(int l, int b){
		length = l; breadth = b;
	}
	void getArea(){
		System.out.println("Area: "+(length*breadth));
	}
}
class A16_area{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length: ");
		int l = sc.nextInt();
		System.out.print("Enter breadth: ");
		int b = sc.nextInt();
		System.out.println("---------------------------");
		Rectangle r = new Rectangle(l,b);
		r.getArea();
	}
}