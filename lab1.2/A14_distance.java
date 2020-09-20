//A14_distance.java
import java.util.*;
class AddDistance{
	int feet,inch;
	Scanner sc = new Scanner(System.in);
	void getDist(){
		System.out.print("Feet: ");
		feet = sc.nextInt();
		System.out.print("Inches: ");
		inch = sc.nextInt();
		System.out.println("-----------------------");
	}
	void addDistance(AddDistance a, AddDistance b){
		feet = a.feet + b.feet;
		inch = a.inch + b.inch;
		System.out.println("Sum: "+feet+" feet "+inch+" inches");
	}
}
class A14_distance{
		public static void main(String args[]){
		AddDistance a = new AddDistance();
		AddDistance b = new AddDistance();
		a.getDist();
		b.getDist();
		a.addDistance(a,b);
	}
}