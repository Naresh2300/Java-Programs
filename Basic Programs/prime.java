import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number;
		int temp=0;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter any Number :");
		number=scanner.nextInt();
		
		for(int i=2 ; i<=number-1 ; i++) {
			
			if(number%i==0) {
			temp=temp+1;
		}
		}
		
		if(temp==0) {
			System.out.println(number+" is Prime");
		}
		else {
			System.out.println(number+" is Not Prime");
		}

	}

}
