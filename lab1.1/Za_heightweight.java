//Za_heightweight.java
class Za_heightweight{
	public static void main(String args[]){
		int count = 0;
		int[] height = {100,120,180,150,135,124,122,189,200,134,156,176,123,146,165,185,125,113} ;
		int[] weight = {60,43,12,45,32,68,52,15,68,96,32,45,57,59,69,67,72,74};
		System.out.println("People data : ");
		for(int i= 0; i<height.length && i<weight.length; i++){
			System.out.println("Person "+i+">>> Height: "+height[i]+" Weight: "+weight[i]);
			if(height[i]>170 && weight[i]<50){
				++count;
			}
		}
		System.out.println("\n=====================================================================================");
		System.out.println(count+" people in the array have both height greater than 170 and weight less than 50");
	}
}