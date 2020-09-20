// A23_overload.java
class Overload{
	int a = 1, b = 2;
	void display(){
		System.out.println("First Method:");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("--------------------");
	}
	void display(int a, int b){
		this.a = a; this.b = b;
		System.out.println("Second Method:");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("--------------------");
	}
}
class A23_overload{
	public static void main(String[] args) {
		Overload c1 = new Overload();
		c1.display();
		c1.display(25,42);
	}
}