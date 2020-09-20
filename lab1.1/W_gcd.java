//w_gcd.java
import java.util.*;
class W_gcd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		int n1 = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		int n2 = sc.nextInt();
		int gcd = gcd(n1,n2);
		System.out.printf("The gcd of the numbers %d and %d is %d.\n",n1,n2,gcd);

	}
	public static int gcd(int a, int b){
		// if(b==0){
		// 	return a;
		// }else{
		// 	return gcd(b,a%b);
		// }
		int gcd = 1;
		for(int i = 2; i<=a && i<=b; i++){
			if(a%i == 0 && b%i == 0){
				gcd = i;
			}
		}return gcd;
	}
}