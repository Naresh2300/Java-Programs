package stringpractice;

public class sPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "";
		
		System.out.println(s1.isEmpty());
		System.out.println(s1.equals(""));
		
		String s3 = "jaddu";
		String s4 = "JADDU";
		
		System.out.println(s3.equalsIgnoreCase(s4));
		
		System.out.println(s3 + s4 );
		
		System.out.println(s3+10+20+30);
		
		System.out.println(10+20+s4);
		
		String t = s4.toLowerCase();
		System.out.println(t);
		
		StringBuffer sb = new StringBuffer("hii");
		sb= rev(sb);
		System.out.println(sb);
		

	}

	private static StringBuffer rev(StringBuffer sb) {
		// TODO Auto-generated method stub
		return null;
	}

}
