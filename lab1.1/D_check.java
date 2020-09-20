//D_check
//Program to Check Whether a Number is Positive or Negative
import java.util.*;
class D_check{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if(num > 0) System.out.println("The number is positive");
		else if(num < 0) System.out.println("The number is negetive");
		else System.out.println("The number is zero");

	}
}