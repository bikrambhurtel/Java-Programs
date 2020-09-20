//A7_Room.java
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
		System.out.println("Area of room: "+b.area(b)+"m^2");
	}
	void displayVolume(Box b){
		System.out.println("Volume of room: "+b.volume(b)+"m^3");
	}
}
class A7_Room{
	public static void main(String args[]){
		Box cb = new Box(50,30,45);
		cb.displayArea(cb);
		cb.displayVolume(cb);
	}
}