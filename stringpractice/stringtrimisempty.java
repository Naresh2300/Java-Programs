package stringpractice;

public class stringtrimisempty {
	
	public static void main(String args[]) {
		
		String name = "  Jonny  ";
		
		if(name.trim().length()>0) {
			System.out.println("Invalid Name");
		}
		
		
		// isempty
		
		String  s="Jay";
		
		System.out.println(s.isEmpty());  // it returns boolean value
		
	}

}
