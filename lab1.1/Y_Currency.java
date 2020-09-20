//Y_Currency.java
import java.util.*;
class Y_Currency{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the currency in Rs.: ");
		float rs = sc.nextFloat();
		float paisa = rs * 100;
		System.out.println("It's equivalent to "+(int)paisa+" Paisa !");
	}
}