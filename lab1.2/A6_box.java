//A6_box.java
class Box{
	double length, breadth, height;
	Box(double l, double b, double h){
		length = l; breadth = b; height = h;
	}
	double area(Box b){
		return b.length * b.breadth;
	}
	double volume(Box b){
		return b.length * b.breadth * b.height;
	}
	void displayArea(Box b){
		System.out.println("Area: "+b.area(b));
	}
	void displayVolume(Box b){
		System.out.println("Volume: "+b.volume(b));
	}
}
class A6_box{
	public static void main(String args[]){
		Box cb = new Box(45,75.5,26);
		cb.displayArea(cb);
		cb.displayVolume(cb);
	}
}