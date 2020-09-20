//A11_triangle.java
import java.lang.Math;
class Triangle{
	double a,b,c;
	Triangle(double a1,double b1,double c1){
		a = a1; b = b1; c = c1;
	}
	double areaTriangle(){
		double s = (a+b+c)/2;
		double rwa = (s * (s - a)*(s-b)*(s));
		double area = Math.sqrt(rwa);
		return area;
	}
	double perimeterTriangle(){
		return a+b+c;
	}
}
class A11_triangle{
	public static void main(String args[]){
		Triangle t = new Triangle(35,23,47);
		double area = t.areaTriangle();
		double perimeter = t.perimeterTriangle();
		System.out.println("Area of Triangle: "+area);
		System.out.println("Perimeter of Triangle: "+perimeter);

	}
}