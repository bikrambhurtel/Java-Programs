// A32_order.java
class classA{
	int a,b;
	classA(int a,int b){
		this.a=a;
		this.b=b;
	System.out.println("--------------------\nClassA\nSum: "+(a+b));
	}
}

class classB extends classA{
	int c;
	classB(int a,int b, int c){
		super(a,b);
		this.c=c;
		System.out.println("-----------------\nClassB:\nSum: "+(a+b+c));
	}
}

class A32_order{
	public static void main(String[] args){
		classB obj = new classB(12,17,28);
	}
}