// B6_userdefined.java
class Exceptions extends Exception{
	String s;
	Exceptions(String s){
		this.s=s;
	}
	public String toString(){
		return ("My Exception!! "+s);
	}
}
class B6_userdefined{
	public static void main(String []args){
		try{
			System.out.println("Inside try block!");
			throw new Exceptions("error Message!!");
		}
		catch(Exceptions e){
			System.out.println("-------\nInside catch block");
			System.out.println(e);
		}
	}
}