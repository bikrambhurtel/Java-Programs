// A26_static.java
class Circle{
	static double r;
	static final double PI = 3.14;
	Circle(double r){
		this.r = r;
	}
	static void getArea(){
		double area = PI * r * r;
		System.out.println("Area: "+area);
	}
}
class A26_static{
	public static void main(String[] args) {
		Circle c1 = new Circle(23);
		c1.getArea();
	}
}