import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0;
		int n2=1;
		int count;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Count");
		count=sc.nextInt();
		
			
	//	System.out.println(n1+" "+ n2);
		
		for(int i=1; i<count ; i++) {
			System.out.print(n1+" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}

	}

}
