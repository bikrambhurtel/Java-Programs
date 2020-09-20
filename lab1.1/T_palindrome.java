//T_palindrome.java
import java.util.*;
class T_palindrome{
	public static void main(String args[]){
		int t, n1=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int un = n;
		while(n != 0){
			t = n % 10;
			n1 = n1 * 10 + t;
			n = n/10;
		}
		System.out.println("The reversed number is: "+ n1);
		if(un == n1){
			System.out.println("The number is palindrome.");
		}else{
			System.out.println("The number is not palindrome !!!");
		}
	}
}