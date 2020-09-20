//A91_triangle.java
import java.lang.Math;
class Triangle{
	double a,b,c;
	double areaTriangle(double a,double b,double c){
		double s = (a+b+c)/2;
		double rwa = (s * (s - a)*(s-b)*(s));
		double area = Math.sqrt(rwa);
		return area;
	}
	double perimeterTriangle(double a,double b,double c){
		return a+b+c;
	}
}
class A91_triangle{
	public static void main(String args[]){
		Triangle t = new Triangle();
		double area = t.areaTriangle(10,20,40);
		double perimeter = t.perimeterTriangle(10,20,40);
		System.out.println("Area of Triangle: "+area);
		System.out.println("Perimeter of Triangle: "+perimeter);

	}
}