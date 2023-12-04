package threadspractice;

public class ThreadInterfaceex implements Runnable{
	
	public void run() {
		System.out.println("Thread created through Runnable Interface");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadInterfaceex ie=new ThreadInterfaceex();
		
		Thread t=new Thread(ie);  // passing ie object in Constructor of Thread because Runnable Interface dont have start method. It has Only Run method
		
		t.start();

	}

}
