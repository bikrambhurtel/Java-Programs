//K_leapYear.java
import java.util.*;
class K_leapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = sc.nextInt();
		boolean flag = false;
		if(year % 400 == 0){
			flag = true;
		}
		else if(year % 100 == 0){
			flag = false;
		}
		else if(year % 4 == 0){
			flag = true;
		}
		if(flag){
			System.out.println("Yup! "+year+" is a leap year ! ");
		}
		else{
			System.out.println("Nope! "+year+" is not a leap year !");
		}
	}
}