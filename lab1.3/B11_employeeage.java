// B11_employeeage.java
import java.util.*;
class B11_employeeage {
  static void checkAge(int age) throws ArithmeticException {
    if (age < 0) {
	 throw new ArithmeticException("Invalid age!!");
    }
    else {
      System.out.println("Valid entry! Proceed further!!");
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
		System.out.println("--------\n"+e);
	}
	System.out.println("-------\nOther statement");
   
  }
}