// B12_propagation.java
class B12_propagation{  
   void method1() throws ArithmeticException{
   		throw new ArithmeticException("Calculation error"); 
   }  
   void method2() throws ArithmeticException{  
		method1();  
   }  
   void method3(){  
	try{  
	   	method2();  
	}
	catch(ArithmeticException e){
	   	System.out.println("ArithmeticException handled");
	}  
   }  
   public static void main(String args[]){  
		B12_propagation obj=new B12_propagation();  
		obj.method3();  
		System.out.println("------\nOther statement");  
   }  
}