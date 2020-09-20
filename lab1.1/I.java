//I_array.java
class I_array{
	public static void main(String []args){
		int sum = 0, count = 0;
		int[] a = {2,4,5,6,1,4,6,7};
		for(int i: a){
			sum = sum + i;
			count += 1;
		}
		int avg = sum/count;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+avg);
	}
}