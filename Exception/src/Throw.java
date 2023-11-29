import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class Throw extends Exception{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		int age;
		System.out.println("Please Enter the Age");
		Scanner scanner=new Scanner(System.in);
		 
		age=scanner.nextInt();
		
		if(age<18) {
			throw new ArithmeticException("Age not Valid");	
		}
		else {
			System.out.println("Eligibble");
		}

	}

}
