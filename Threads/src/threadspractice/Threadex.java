package threadspractice;

public class Threadex extends Thread{
	
	public void run() {
		System.out.println("Thread is Running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadex tx=new Threadex();
		tx.start();
		

	}

}
