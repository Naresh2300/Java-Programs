

interface inf{
	default void m1() {
		System.out.println("Default method In Interface");
	}
}


public class DefaultMethod implements inf{
	
	public void m1() {
		System.out.println("Ovverided the method");
		}

public static void main(String[] args) {
		
		
		DefaultMethod md =new DefaultMethod();
	//	md.m1();
		
		//can also ovveride the inteface method
			
		
		md.m1();

	}

}
