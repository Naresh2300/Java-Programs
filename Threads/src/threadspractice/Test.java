package threadspractice;


class thread1 extends Thread{
	
	public void run() {
		System.out.println("Task 1");
	}
}
	
	
 class thread2 extends Thread{
	
	public void run() {
		System.out.println("Task 2");
	}

}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thread1 t1=new thread1();
		t1.start();
		
		thread2 t2=new thread2();
		t2.start();
	}

}






	




