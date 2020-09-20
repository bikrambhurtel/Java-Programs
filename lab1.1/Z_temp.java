//Z_temp.java
import java.util.*;
class Z_temp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahrenheit: ");
		float fh = sc.nextFloat();
		float cs = (fh-32f)/1.8f;
		System.out.println("The temperature is "+cs+" degree celsius.");
	}
}