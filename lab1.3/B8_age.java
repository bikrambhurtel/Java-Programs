// B8_age.java
import java.util.*;
class InvalidAgeException extends Exception{  
     InvalidAgeException(String s){  
      super(s);  
     }  
 } 
class B8_age {
  static void checkAge(int age) throws InvalidAgeException {
    if (age < 18) {
	 throw new InvalidAgeException("Invalid age!!");
    }
    else {
      System.out.println("Welcome!!");
    }
  }
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age: ");
	int age = sc.nextInt();
	try{
		checkAge(age);		
	}
	catch(InvalidAgeException e){
		System.out.println(e);
	}
   
  }
}