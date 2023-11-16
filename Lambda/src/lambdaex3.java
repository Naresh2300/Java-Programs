
interface inter{
	
	public int getlength(String s);
}


public class lambdaex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			inter i = (s) ->  { return s.length();};  //can remove Curly braces if only onr single Statement
			
			System.out.println(i.getlength("Hello"));
			
			
			
			
	}

}
