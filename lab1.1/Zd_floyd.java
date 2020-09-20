//Zd_floyd.java
import java.util.*;
class Zd_floyd{
	public static void main(String args[]){
		int k = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the limit for Floyd's triangle: ");
		int n = sc.nextInt();
		System.out.println("Floyd's Triangle : \n ========================================");
		for(int i = 1; k<=n; i++){
			for(int j = 1;j<=i;j++){
				System.out.print(k+" ");
				++k;
			}
			System.out.println();
		}
	}
}