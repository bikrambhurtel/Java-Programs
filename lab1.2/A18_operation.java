// A18_operation.java
import java.util.*;
class Arithmetic{
	int a, b;
	Arithmetic(int a, int b){
		this.a = a;
		this.b = b;
	}
	int add(){ return a+b; }
	int sub(){ return a-b; }
	int div(){ return a/b; }
	int mul(){ return a*b; }
	int mod(){ return a%b; }
}
class A18_operation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int b = sc.nextInt();
		System.out.println("-----------------------------");
		Arithmetic ath = new Arithmetic(a,b);
		System.out.println("Sum: "+ath.add());
		System.out.println("Difference: "+ath.sub());
		System.out.println("Product: "+ath.mul());
		System.out.println("Division: "+ath.div());
		System.out.println("Modulus: "+ath.mod());
	}
}