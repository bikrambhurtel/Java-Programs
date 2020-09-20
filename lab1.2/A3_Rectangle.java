//A3_Rectangle.java
class Rectangle{
	int length, breadth;
	Rectangle(int l, int b){
		length = l;
		breadth = b;
	}
	int area(Rectangle r){
		return r.length * r.breadth;
	}
	int perimeter(Rectangle r){
		return 2 * (r.length + r.breadth);
	}
}
class A3_Rectangle{
	public static void main(String args[]){
		Rectangle rec = new Rectangle(25,32);
		System.out.println("Area: "+ rec.area(rec));
		System.out.println("Perimeter: " +rec.perimeter(rec));
	}
}