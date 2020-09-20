//U_factorial.java
import java.util.*;
class U_factorial{
	public static void main(String args[]){
		int t, fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		while(n != 1){
			fact = fact * n;
			n--;
		}
		System.out.println("Factorial of the number is "+ fact);
	}
}