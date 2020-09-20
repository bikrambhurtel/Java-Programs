// B3__finally.java
class B3__finally{
	public static void main(String []args){
		int a[]={1,2,3,4},b;
		try{
			b=24/a[5];
			System.out.println("b = "+b);
			}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The Array index out of Bound error!!");
			}
		finally{
			b=24/a[3];
			System.out.println("b = "+b);
			}
	}
}