//M_blood.java
import java.util.*;
class M_blood{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.print("Enter your weight in kg: ");
		int weight = sc.nextInt();
		if(age>=18 && weight>=50){
			System.out.println("Congratulations! you're elligible to donate blood.");
		}else{
			System.out.println("Sorry! you're not elligible to donate blood.");
		}
	}
}