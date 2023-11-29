
public class catchorder {
	
	public static void main(String args[]) {
		
		try {
			System.out.println("Exiting");
			System.exit(0);   //if we give value 1000 then also same result or negative value also
			System.out.println(20/0);
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
		
		}
		catch (Exception e) {
		System.out.println(e);
		}

	}

}
