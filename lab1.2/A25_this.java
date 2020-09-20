// A25_this.java
class Thisclass{
	int a = 1, b = 2;
	Thisclass(int a, int b){
		this.a = a;
		this.b = b;
	}
	void display(){
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("------------------------");
	}
}
class A25_this{
	public static void main(String[] args) {
		Thisclass th = new Thisclass(23,42);
		Thisclass t = new Thisclass(98,15);
		System.out.println("First Object");
		th.display();
		System.out.println("Second Object");
		t.display();
	}
}