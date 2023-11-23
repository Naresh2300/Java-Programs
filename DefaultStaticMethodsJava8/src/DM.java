
interface Left{
	
	default void m1() {
		System.out.println("Executing Left Inteface");
	}
}


interface Right{
	
	default void m1() {
		System.out.println("Excuting Right Interface");
	}
	
}


public class DM implements Left,Right{
	
//	public void m1() {
//		 	System.out.println("My own implementation");
//	}
	
	public void m1() {
		Left.super.m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			DM d=new DM();  // will not work will cause Ambiguity
			d.m1();
	}

}
