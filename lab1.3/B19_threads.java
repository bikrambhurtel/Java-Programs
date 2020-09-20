// B19_threads.java
import java.io.*;
class ClassA extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			if(i==1) yield();
				System.out.println("From thread A i=:"+i);
		}
		System.out.println("Exit from A");
	}
}

class ClassB extends Thread{
	public void run(){
		for(int j=0;j<=5;j++){
			if(j==3) stop();
				System.out.println("From thread B j=:"+j);
		}
		System.out.println("Exit from B");
	}
}

class ClassC extends Thread{
	public void run(){
		for(int k=0;k<=5;k++){
			System.out.println("From thread C k=:"+k);
			if(k==0){
				try{
					sleep(1000);
				}
				catch(Exception e)
				{
					System.out.println("Sleeping fo a moment");
				}
			}
			System.out.println("Exit from C");
		}
	}
}

class B19_threads {
	public static void main(String []args){
		ClassA threadA = new ClassA();
		ClassB threadB = new ClassB();
		ClassC threadC = new ClassC();
		
		System.out.println("Start thread A"+threadA.getName());
		threadA.start();
		System.out.println("Start thread B"+threadB.getName());
		threadB.start();
		System.out.println("Start thread C"+threadC.getName());
		threadC.start();
		
		threadA.setName("It is renamed Thread D");
		threadB.setName("It is renamed Thread E");
		System.out.println("New Thread A rename:  " + threadA.getName()); 
        System.out.println("New Thread B rename: " + threadB.getName()); 	
		
		System.out.println("End of Main thread");
	}
}