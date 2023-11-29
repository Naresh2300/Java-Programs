

public class Throws {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		
		doStuff();
	}
		public static void doStuff() throws InterruptedException
		{
				doMoreStuff();
					
		}
		public static void doMoreStuff() throws InterruptedException	{
			
			Thread.sleep(1000);
			System.out.println("Throws Working");
		}
		

	

}
