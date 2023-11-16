
 interface interf{
	 public void add(int a,int b);
	
}


public class lamdaex2 {

	public static void main(String[] args) {
		
		interf i = (a,b) -> System.out.println("the addition is : "+(a+b));
	
		i.add(10, 20);

}
}
