//L_grade.java
import java.util.*;
class L_grade{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your obtained marks in the following subjects out of total 100 marks:");
		System.out.print("---------------------------------------------------------------");
		System.out.print("\nEnter the marks in JAVA: ");
		int java = sc.nextInt();
		System.out.print("Enter the marks in ADBMS: ");
		int dbms = sc.nextInt();
		System.out.print("Enter the marks in IT: ");
		int it = sc.nextInt();
		System.out.print("Enter the marks in NSA: ");
		int nsa = sc.nextInt();
		System.out.println("-----------------------------------------------------------------");
		int total = java + dbms + it + nsa;
		int avg = total/4;
		String grade;
		if(avg>=90 && avg<=100){	grade = "A+";	}
		else if(avg>=80){	grade = "A";	}
		else if(avg>=70){	grade = "B+";	}
		else if(avg>=60){	grade = "B";	}
		else if(avg>=50){	grade = "C+";	}
		else if(avg>=40){	grade = "C";	}
		else if(avg>=30){	grade = "D+";	}
		else if(avg>=20){	grade = "D";	}
		else if(avg>=0){	grade = "E";	}
		else{	grade = "Please enter valid marks!!";	}
		System.out.println("Grade: "+grade);
	}
}