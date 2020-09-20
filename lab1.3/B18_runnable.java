// B18_runnable.java
class B18_runnable implements Runnable{  
     public void run(){  
      for(int i=1;i<20;i++){  
        try{
		Thread.sleep(500);
		}
		catch(InterruptedException e){
		System.out.println(e);
		}  
        System.out.print(i+"	");  
      }
      System.out.println();  
     }  
     public static void main(String args[]){  
      B18_runnable t1=new B18_runnable();  
      B18_runnable t2=new B18_runnable();  
       
      t1.run();  
      t2.run();  
     }  
    }