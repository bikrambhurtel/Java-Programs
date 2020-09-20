// A27_inheritance.java
class Class1{
	int a,b;
	void setData(int a, int b){
		this.a = a; this.b = b;
	}
	void display(){
		int p = a*b;
		System.out.println("P: "+p);
	}
}
class Class2 extends Class1{
	int c;
	void setData(int a, int b, int c){
		this.a = a; this.b = b; this.c = c;
	}
	void displaySum(){
		System.out.println("Sum: "+(a+b+c));
	}
}
class A27_inheritance{
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();
		c1.setData(23,12);
		c2.setData(27,56,42);
		System.out.println("Class1:");
		c1.display();
		System.out.println("-------------------");
		System.out.println("Class2:");
		c2.display();
		c2.displaySum();
	}
}