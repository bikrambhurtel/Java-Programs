//A13_rectangle.java
import java.util.*;
class Rectangle{
	int length, breadth;
	Scanner sc = new Scanner(System.in);
	void setDim(){
		System.out.print("Enter length: ");
		length = sc.nextInt();
		System.out.print("Enter breadth: ");
		breadth = sc.nextInt();
	}
	void getArea(){
		int area = length*breadth;
		System.out.println("-------------------------");
		System.out.println("Area: "+area);
	}
}
class A13_rectangle{
	public static void main(String args[]){
		Rectangle r = new Rectangle();
		r.setDim();
		r.getArea();
	}
}