import java.util.function.Function;

public class Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s= "I Love Java";
		
		Function<String,String> f =s1->s1.replaceAll(" ","");
		
		System.out.println(f.apply(s));

	}

}
