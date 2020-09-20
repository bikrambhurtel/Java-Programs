//A38_protected.java
class classA{
    protected int a=25,b=15;
        void display(){
        System.out.printf("a: %d \nb: %d",a,b);
        System.out.println("\nSum: "+(a+b));
    }
    protected void display1(){
	    System.out.println("-------------------\nA Protected method called!\nCannot be accessed from non-subclass in another package!!");
    }
}
class A38_protected{
	public static void main(String []args){
	    classA oa = new classA();
	    oa.display(); 
	    oa.display1(); //does not give error
	}
}
