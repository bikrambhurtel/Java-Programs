// B20_priority.java
import java.io.*;
class ClassA extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println("From thread A i=:"+i);
		}
		System.out.println("Exit from A");
	}
}
class ClassB extends Thread{
	public void run(){
		for(int j=0;j<=5;j++){
			System.out.println("From thread B j=:"+j);
		}
		System.out.println("Exit from B");
	}
}
class ClassC extends Thread{
	public void run(){
		for(int k=0;k<=5;k++){
			System.out.println("From thread C k=:"+k);
		}
		System.out.println("Exit from C");
	}
}
class B20_priority {
	public static void main(String []args){
		ClassA threadA = new ClassA();
		ClassB threadB = new ClassB();
		ClassC threadC = new ClassC();
	
		threadC.setPriority(2);
		threadB.setPriority(6);
		threadA.setPriority(4);
		
		System.out.println("Start thread A");
		threadA.start();
		System.out.println("Start thread B");
		threadB.start();
		System.out.println("Start thread C");
		threadC.start();
		
		
		System.out.println("End of Main thread");
	}
}