//N_search.java
import java.util.*;
class N_search{
	public static void main(String args[]){
		int c = 0;
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to search: ");
		int n = sc.nextInt();
		int[] a = {2,4,12,45,32,4,6,7,67,89,34,12,33,10,9,5,32,23,76,12,11};
		for(int i: a){
			if(i == n){
				System.out.println(a[c]+" found at index "+c);
				flag = false;
			}
			c += 1;
		}
		if(flag){
			System.out.println("Not found!!");
		}
	}
}