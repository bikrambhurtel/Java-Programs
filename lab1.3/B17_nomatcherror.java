// B17_nomatcherror.java
import java.util.*;
class NotMatchException extends Exception{
	String s;
	NotMatchException(String s){
		super(s);
	}
}
class B17_nomatcherror{
	void checkName(String name) throws NotMatchException{
		if(name != "Nepal" || name != "nepal"){
			throw new NotMatchException("NOT MATCHED!!");
		}else{
			System.out.println("Name Matched!");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		B17_nomatcherror s = new B17_nomatcherror();
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		try{
			s.checkName(name);
		}
		catch(NotMatchException e){
			System.out.println(e);
		}
		
		System.out.println("----------\nOther Statement");
	}
}