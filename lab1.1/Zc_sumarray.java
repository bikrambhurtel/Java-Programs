//Zc_sumarray.java
class Zc_sumarray{
	public static void main(String args[]){
		int sum = 0;
		int[] a = {100,120,180,150,135,124,122,189,200,134,59,69,67,72,74,256,176,113};
		System.out.print("Array elements : ");
		for(int j:a){
			System.out.print(j+" ");
		}
		System.out.println("\n===============================================================");
		System.out.println("Array elements greater than 100, less than 200 and divisible by 7 are: ");
		for(int i: a){
			if(i>100 && i<200 && i%2==0){
				System.out.print(i+" ");
				sum = sum + i;
			}
		}
		System.out.println("\n==================================================================");
		System.out.println("Sum: "+sum);
	}
}