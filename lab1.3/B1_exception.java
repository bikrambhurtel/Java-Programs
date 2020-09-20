//B1_exception.java
class B1_exception{
	public static void main(String[] args) {
		int a=9, b=0;
		try{
			System.out.println("Div: "+(a/b));
		}
		catch(ArithmeticException e){
			System.out.println("------------\nDivision by zero error !!\n-------------");
		}
	}
}