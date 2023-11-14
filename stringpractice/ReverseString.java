package stringpractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Aniket";
		
		int len = name.length();
		String rev="";
		
		for(int i=len-1 ; i>=0  ; i--) {
			rev= rev+name.charAt(i);
		}
		
		System.out.println("Reverse of "+name+" is "+rev);

	}

}
