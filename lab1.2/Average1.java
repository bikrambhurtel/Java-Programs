//Creating Package
package package1;
import java.util.*;
public class Average1{
	int a,b,c;
	public void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		b = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		c = sc.nextInt();
		System.out.println("---------------------------");
	}
	public void getAverage(){
		double avg = (a+b+c)/3;
		System.out.println("Average: "+avg);
	}
}