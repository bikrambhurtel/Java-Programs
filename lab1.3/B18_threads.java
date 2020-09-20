// B18_threads.java
class B18_threads extends Thread{  
    public void run(){  
    	for(int i=1;i<24;i++){  
       		try{
				Thread.sleep(300);
			}
			catch(InterruptedException e){
				System.out.println(e);
			}  
        	System.out.print(i+"	");  
      	}
	}  
    public static void main(String args[]){  
      	B18_threads t1=new B18_threads();  
      	B18_threads t2=new B18_threads();  
       
      	t1.run();  
      	t2.run();  
    }
 }