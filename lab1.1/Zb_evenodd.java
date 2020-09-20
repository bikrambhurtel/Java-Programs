//Zb_evenodd.java
class Zb_evenodd{
	public static void main(String args[]){
		int ec = 0,oc = 0;
		int[] a = {100,120,180,150,135,124,122,189,200,134,156,176,123,146,165,185,125,113} ;
		for(int i: a){
			if(i%2==0){
				System.out.print("even >> "+i+"    ");
				++ec;
			}else{
				System.out.print("odd >> "+i+"     ");
				++oc;
			}
		}
		System.out.println("\n========================================================");
		System.out.printf("There are total %d even numbers and %d odd numbers. \n",ec,oc);
	}
}