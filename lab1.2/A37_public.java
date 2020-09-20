//A37_public.java
class classA{
    private int a=25,b=15;
        void display(){
        System.out.printf("a: %d \nb: %d",a,b);
        System.out.println("\nSum: "+(a+b));
    }
    public void display1(){
	    System.out.println("-------------------\nA Public method called!");
    }
}
class A37_public{
	public static void main(String []args){
	    classA oa = new classA();
	    oa.display(); 
	    oa.display1(); //does not give error
	}
}
