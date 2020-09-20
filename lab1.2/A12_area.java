//A12_area.java
class Rectangle{
	int length, breadth;
	Rectangle(int l, int b){
		length = l;
		breadth = b;
	}
	void displayArea(){
		int area = length * breadth;
		System.out.println("Area: "+area);
	}
}
class A12_area{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle(4,5);
		Rectangle r2 = new Rectangle(5,8);
		r1.displayArea();
		r2.displayArea();
	}
}