// A28_inheritance.java
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
class Class3 extends Class2{
	int d;
	void setData(int a, int b, int c, int d){
		this.a = a; this.b = b; this.c = c; this.d = d;
	}
	void displayC3(){
		System.out.println("a*b + c*d : "+(a*b)+" + "+(c*d));
	}
}
class A28_inheritance{
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();
		Class3 c3 = new Class3();
		c1.setData(12,15);
		c2.setData(9,15,20);
		c3.setData(45,23,5,9);
		System.out.println("Class1:");
		c1.display();
		System.out.println("-------------------");
		System.out.println("Class2:");
		c2.display();
		c2.displaySum();
		System.out.println("-------------------");
		System.out.println("Class3:");
		c3.display();
		c3.displaySum();
		c3.displayC3();
	}
}