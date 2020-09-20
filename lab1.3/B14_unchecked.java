// B14_unchecked.java
class B14_unchecked{
	public static void main(String[] args) {
		int a=9, b=0;
		try{
			System.out.println("Div: "+(a/b));
		}
		catch(ArithmeticException e){
			System.out.println("------------\nDivision by zero error !!\nUnchecked exception handled\n-------------");
		}
		System.out.println("Out of try catch block! Other statement");
	}
}