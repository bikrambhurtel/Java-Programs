//F_SimpleInterest.java
import java.util.*;
class F_SimpleInterest{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter principal amount: ");
		int p = sc.nextInt();
		System.out.print("Enter rate: ");
		int r = sc.nextInt();
		System.out.print("Enter time period in year: ");
		int t = sc.nextInt();
		int si = (p*t*r)/100;
		System.out.println("The value of Simple Interest is: "+si);

	}
}