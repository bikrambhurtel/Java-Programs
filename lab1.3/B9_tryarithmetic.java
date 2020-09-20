// B9_tryarithmetic.java
class B9_tryarithmetic{
	public static void main(String []args){
		int a,b;
		try{
			a=0;
			b=24/a;
		}
		catch(ArithmeticException e){
			System.out.println("Division by 0 error!!");
		}
			System.out.println("--------\nOther statement");
	}
}