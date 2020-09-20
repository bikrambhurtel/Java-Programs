//H_sum.java
import java.util.*;
class H_sum{
	public static void main(String args[]){
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the end for the natural number: ");
		int n = sc.nextInt();
		for(int i = 1; i<=n; i++){
			sum = sum + i;
		}
		System.out.println("The sum of first %d natural numbers is "+sum, 123);
	}
}