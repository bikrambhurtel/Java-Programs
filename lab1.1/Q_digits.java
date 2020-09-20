//Q_digits.java
import java.util.*;
class Q_digits{
	public static void main(String args[]){
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		while(n != 0){
			n = n/10;
			count++;
		}
		System.out.printf("There are %d digits in your number. \n",count);

	}
}