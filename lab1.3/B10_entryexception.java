// B10_entryexception.java
import java.util.*;
class B10_entryexception {
  static void checkAge(int age, int weight) throws ArithmeticException {
    if (age < 12 || weight < 40) {
	 throw new ArithmeticException("Not illigible");
    }
    else {
      System.out.println("Valid entry! Proceed further for registration");
    }
  }
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age: ");
	int age = sc.nextInt();
	System.out.print("Enter your weight: ");
	int weight = sc.nextInt();
	try{
		checkAge(age,weight);		
	}
	catch(ArithmeticException e){
		System.out.println("--------\nStudent is not eligible for registration!");
	}
   
  }
}
