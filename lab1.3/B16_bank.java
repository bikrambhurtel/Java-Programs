//B16_bank.java
import java.util.*;
class Account{
	double balance = 10000;
	double withdraw(double amount, Account a){
		System.out.println("Withdrawl successful!!");
		return a.balance - amount;
	}
	double deposit(double amount, Account a){
		System.out.println("Deposit successful!!");
		return a.balance + amount;
	}
}
class InsufficientFundsException extends Exception{
	String s;
	InsufficientFundsException(String s){
		super(s);
	}
}
class B16_bank{
	public static void main(String args[]){
		double amount;
		Scanner sc = new Scanner(System.in);
		Account acc = new Account();
		B16_bank bnk = new B16_bank();
		while(true){
			System.out.print("Type 'w' for withdrawl and 'd' for deposit: ");
			char ch = sc.next().charAt(0);
			switch(ch){
				case 'w':
					System.out.print("Enter amount to withdraw: Rs.");
					amount = sc.nextDouble();
					if(amount <= acc.balance){
						acc.balance = acc.withdraw(amount, acc);
					}else{
						try{
								throw new InsufficientFundsException("Withdrawl error!!");
						}
						catch(InsufficientFundsException e){
							System.out.println("--------\n"+e);
							System.out.println("You don't have enough money for this withdrawl");
						}
					}
					break;
				case 'd':
					System.out.print("Enter amount to deposit: Rs.");
					amount = sc.nextDouble();
					acc.balance = acc.deposit(amount, acc);
			}
			System.out.println("New balance: Rs."+acc.balance);
			System.out.println("----------------------------------");
			System.out.print("Continue? (y/n): ");
			char cn = sc.next().charAt(0);
			if(cn != 'y' && ch != 'Y'){break;}
		}
	}
}