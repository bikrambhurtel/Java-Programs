// A30_overriding.java
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
	void display(){
		System.out.println("Sum: "+(a+b+c));
	}
}
class A30_overriding{
	public static void main(String[] args) {
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();
		c1.setData(12,15);
		c2.setData(9,15,20);
		System.out.println("Methods Overriden: \n -------------------");
		System.out.println("Class1:");
		c1.display();
		System.out.println("-------------------");
		System.out.println("Class2:");
		c2.display();
	}
}