// B2_multipleException.java
class B2_multipleException{
	public static void main(String []args){
		int a[]={1,2,3,4},b;
	try{
		b=24/a[5];
		}
	catch(ArithmeticException e){
		System.out.println("--------------\nDivision by zero error!!");
	}
	catch(ArrayIndexOutOfBoundsException c){
		System.out.println("--------------\nArray index out of Bound error!!");
	}
		System.out.println("Exception catched\n----------------");
	}
}