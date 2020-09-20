// A17_avg.java
import java.util.*;
class Average{
	int a,b,c;
	void getData(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number: ");
		a = sc.nextInt();
		System.out.print("Enter 2nd number: ");
		b = sc.nextInt();
		System.out.print("Enter 3rd number: ");
		c = sc.nextInt();
		System.out.println("---------------------------");
	}
	void getAverage(){
		double avg = (a+b+c)/3;
		System.out.println("Average: "+avg);
	}
}
class A17_avg{
	public static void main(String args[]){
		Average avg = new Average();
		avg.getData();
		avg.getAverage();
	}
}