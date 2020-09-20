// B22_synchronization.java
import java.io.*;
class ClassA extends Thread{
	public void run(){
		for(int i=0;i<=5;i++){
			System.out.println(Thread.currentThread().getName()+(i));
		}
	}
}

class B22_synchronization {
	public static void main(String []args){
		ClassA threadA = new ClassA();
		Thread t1= new Thread(threadA);
		t1.setName("t1:");
		t1.start();
		Thread t2= new Thread(threadA);
		t2.setName("t2:");
		t2.start();
	}
}