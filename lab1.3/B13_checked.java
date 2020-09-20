// B13_checked.java
class B13_checked{
	public static void main(String[] args){
		try{
			Exception e = new Exception();
			throw new ClassNotFoundException("error!");
		}
		catch(ClassNotFoundException e){
			System.out.println("-------\n"+e);
		}
		System.out.println("--------\nOther statement");
	}
}