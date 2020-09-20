//A36_private.java
class classA{
    private int a=25,b=15;
        void display(){
        System.out.printf("a: %d \nb: %d",a,b);
        System.out.println("\nSum: "+(a+b));
    }
    private void display1(){
	    System.out.println("-------------------\nA private method called!");
    }
}
class A36_private{
	public static void main(String []args){
	    classA oa = new classA();
	    oa.display(); 
	    //oa.display1(); gives error
	}
}
