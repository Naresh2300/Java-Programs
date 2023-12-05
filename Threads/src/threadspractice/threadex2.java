package threadspractice;

public class threadex2 extends Thread{
	
	public void run() {
		System.out.println("Single Task From Multiple Threads");
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		threadex2 t= new threadex2();
		t.start();
		
		
		threadex2 t1=new threadex2();
		t1.start();
		

	}

}
