//A15_complex.java
import java.util.*;
class Complex{
	int real,img;
	Scanner sc = new Scanner(System.in);
	void getData(){
		System.out.print("real: ");
		real = sc.nextInt();
		System.out.print("img: ");
		img = sc.nextInt();
		System.out.println("----------------------");
	}
	void getSum(Complex a, Complex b){
		int real1 = a.real + b.real;
		int img1 = a.img + b.img;
		System.out.println("Sum: "+real1+"+"+img1+"i");
	}
	void getProduct(Complex a, Complex b){
		int real1 = a.real * b.real;
		int img1 = a.img * b.img;
		System.out.println("Product: "+real1+"+"+img1+"i");
	}
	void getDifference(Complex a, Complex b){
		int real1 = a.real - b.real;
		int img1 = a.img - b.img;
		System.out.println("Difference: "+real1+"+"+img1+"i");
	}
}
class A15_complex{
	public static void main(String args[]){
		Complex a = new Complex();
		Complex b = new Complex();
		a.getData();
		b.getData();
		a.getSum(a,b);
		a.getProduct(a,b);
		a.getDifference(a,b);
	}
}