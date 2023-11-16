
interface   in{
	
	public int square(int x);
}

public class lambdaex4 {
	
	public static void main(String[] args) {
		
		in n = (x) -> x*x;
		
		System.out.println(n.square(5));

	}

}
