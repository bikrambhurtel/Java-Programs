//X_calculator.java
import java.util.*;
class X_calculator{
	public static void main(String args[]){
		boolean flag = true; int result = 0;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("Enter 1st number: ");
			int a = sc.nextInt();
			System.out.print("Enter 2nd number: ");
			int b = sc.nextInt();
			System.out.print("Enter operator: ");
			char op = sc.next().charAt(0);
			System.out.println("Operator: "+ op);
			System.out.println("-----------------------------------------");

			switch(op){
				case '+':
					result = a+b;
					break;
				case '-':
					result = a - b;
					break;
				case '*':
					result = a*b;
					break;
				case '/':
					result = a/b;
					break;
				case '%':
					result = a%b;
					break;
				default:
					System.out.println("Please Enter the valid operator !!");
					flag = false;
					break;
			}
			if(flag){
				System.out.printf("%d %c %d = %d \n",a,op,b,result);	
			}
			System.out.println("---------------------------------------------");
			System.out.println("Do you want to continue? (y/n): ");
			char que = sc.next().charAt(0);
			if(que != 'y' && que != 'Y'){break;}
		}
	}
}