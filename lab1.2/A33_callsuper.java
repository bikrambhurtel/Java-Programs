// A33_callsuper.java
class ClassA{
	int a,b;
	ClassA(int a,int b){
		this.a=a;
		this.b=b;
		System.out.println("--------\nClassA:\nSum: "+(a+b));
	}
}
class ClassB extends ClassA{
	ClassB(int a, int b){
		super(a,b);
		System.out.println("----------\nFrom ClassB");
	}
}
class A33_callsuper{
	public static void main(String[] args){
		ClassB obj=new ClassB(15,32);
	}
}