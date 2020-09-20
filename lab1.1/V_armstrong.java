//V_armstrong.java
import java.util.*;
class V_armstrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		int pow = digits(n);
		System.out.println("Digits count: "+pow);
		System.out.println("Number: "+n);
		int arm = armstrong(n,pow);
		System.out.println("Calculated sum of exponentials of digits: "+arm);
		if(arm == n){
			System.out.println("The number is armstrong number.");
		}else{
			System.out.println("The number is not armstrong number!!!");
		}
	}
	public static int digits(int num){
		int count = 0;
		while(num != 0){
			num = num/10;
			count++;
		}return count;
	}
	public static int armstrong(int num, int digits){
		int t, arm = 0;
		while(num != 0){
			t = num % 10;
			arm = arm + pow(t,digits);
			num = num/10;
		}return arm;
	}
	public static int pow(int a, int b){
		for(int i = 2; i < b; i++){
			a = a*a;
		}
		System.out.println("Exp: "+a);
		return a;
	}
}