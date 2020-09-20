// B4_throw.java
class B4_throw{
	public static void main(String []args){
		int a[]={1,2,3,4},b;	
		try{
			b=24/a[5];
			throw new ArrayIndexOutOfBoundsException();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The array index out of bound error!!");
		}
	}
}