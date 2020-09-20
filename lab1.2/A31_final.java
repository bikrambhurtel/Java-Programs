// A31_final.java
//final keyword to class Circle to prevent inheritance
final class Circle{
	double r;
	static final double PI = 3.14;
	Circle(double r){
		this.r = r;
	}
	void getArea(){
		double area = PI * r * r;
		System.out.println("Area: "+area);
	}
}
class A31_final{
	public static void main(String[] args) {
		Circle c1 = new Circle(15);
		c1.getArea();
	}
}

