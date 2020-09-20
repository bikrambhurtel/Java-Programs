//J_array.java
class J_array{
	public static void main(String []args){
		int[] a = {2,4,5,6,1,4,6,7,9,3};
		System.out.println("Array Length: "+a.length);
		System.out.println("Max: "+getMax(a));
		System.out.println("Min: "+getMin(a));
	}
	//Method for getting maximum value
	public static int getMax(int[] intarray){
		int max = intarray[0];
		for(int i: intarray){
			if(i>max){
				max = i;
			}
		}
		return max;
	}
	//Method for getting minimum value
	public static int getMin(int[] intarray){
		int min = intarray[0];
		for(int i: intarray){
			if(i<min){
				min = i;
			}
		}
		return min;
	}
}