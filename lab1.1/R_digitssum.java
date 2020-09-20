//R_digitssum.java
import java.util.*;
class R_digitsum{
	public static void main(String arg[]){
		int sum = 0, t;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		while(n != 0){
			t = n % 10;
			sum = sum + t;
			n = n/10;
		}
		System.out.println("The sum of the digits of your number is: "+sum);
	}
}