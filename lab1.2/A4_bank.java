//A4_bank.java
import java.util.*;
class Account{
	double balance = 10000;
	double withdraw(double amount, Account a){
		return a.balance - amount;
	}
	double deposit(double amount, Account a){
		return a.balance + amount;
	}
}
class A4_bank{
	public static void main(String args[]){
		double amount;
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		while(true){
			System.out.print("Type 'w' for withdrawl and 'd' for deposit: ");
			char ch = sc.next().charAt(0);
			switch(ch){
				case 'w':
					System.out.print("Enter amount to withdraw: Rs.");
					amount = sc.nextDouble();
					if(amount > acc.balance){
						System.out.println("Not enough money for this withdrawl !!");
					}else{
						acc.balance = acc.withdraw(amount, acc);
					}break;
				case 'd':
					System.out.print("Enter amount to deposit: Rs.");
					amount = sc.nextDouble();
					acc.balance = acc.deposit(amount, acc);
			}
			System.out.println("Your balance is : Rs."+acc.balance);
			System.out.println("----------------------------------");
			System.out.print("Continue? (y/n): ");
			char cn = sc.next().charAt(0);
			if(cn != 'y' && ch != 'Y'){break;}
		}
	}
}