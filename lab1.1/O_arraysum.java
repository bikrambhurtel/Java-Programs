//O_arraysum.java
class O_arraysum{
	public static void main(String args[]){
		int c = -1, t =0, sum = 0;
		int[] a = {2,4,5,6,1,4,6,7,9,3};
		for(int i: a){
			c += 1;
			System.out.print(i + " ");
			if(c == 5){continue;}
			sum = sum + i;
		}
		System.out.println("\nThe sum of the array elments except at index 5 is "+sum);

	}
}