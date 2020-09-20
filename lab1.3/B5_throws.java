// B5_throws.java
import java.util.*;
class B5_throws {
  static void checkAge(int age) throws ArithmeticException {
    if (age < 18) {
	 throw new ArithmeticException("Access denied");
    }
    else {
      System.out.println("Access granted: Welcome!!");
    }
  }
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age: ");
	int age = sc.nextInt();
	try{
		checkAge(age);		
	}
	catch(ArithmeticException e){
		System.out.println("Access denied: you must be 18 years or older!");
	}
   
  }
}
