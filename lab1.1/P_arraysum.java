//P_arraysum.java
class P_arraysum{
	public static void main(String args[]){
		int sum = 0;
		int[] a = {2,4,5,6,1,4,6,7,9,3,-1,7,9,-6,3};
		System.out.print("The array elements are: ");
		for(int j: a){ System.out.print(j+ " "); }
		System.out.print("\nThe array elements taken for sum: ");
		for(int i: a){
			if(i<0){
				break;
			}
			System.out.print(i + " ");
			sum = sum + i;
			
		}
		System.out.println("\nSum: "+sum);

	}
}