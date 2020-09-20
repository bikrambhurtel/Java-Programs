// B7_nestedtry.java
class B7_nestedtry{  
     public static void main(String args[]){  
  		try{  
    		try{  
     			System.out.println("going to divide\n--------");  
     			int b =39/0;  
    		}catch(ArithmeticException e){System.out.println(e);}  
   
    		try{  
   		 		int a[]=new int[5];  
    			a[5]=4;  
   		 	}catch(ArrayIndexOutOfBoundsException e){System.out.println(e);}  
     
   		 	System.out.println("---------\nother statement");  
  		}catch(Exception e){System.out.println("handeled");}  
  
  		System.out.println("normal flow..");  
 	}  
}