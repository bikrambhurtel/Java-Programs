//S_reverse.java
import java.util.*;
class S_reverse{
	public static void main(String args[]){
		int t, n1=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		while(n != 0){
			t = n % 10;
			n1 = n1 * 10 + t;
			n = n/10;
		}
		System.out.println("The reversed number is: "+ n1);
	}
}