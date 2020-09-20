// A24_object.java
class Object{
	int a = 1, b = 2;
	void display(Object o){
		o.a = o.a + 1;
		System.out.println("value: "+o.a);
	}
}
class A24_object{
	public static void main(String[] args) {
		Object o1 = new Object();
		o1.display(o1);
		o1.display(o1);
	}
}