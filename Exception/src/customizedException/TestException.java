package customizedException;

import java.util.Scanner;

public class TestException extends InvalidAgeException{

public TestException(String str) {
		super(str);
		// TODO Auto-generated constructor stub
	}

//	public TestException(String str) {
//		super(str);
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		
		
		int age;
		Scanner scanner=new Scanner(System.in);
		
		age=scanner.nextInt();
		
		if(age<18) {
			throw new InvalidAgeException("Not Eligible to Vote");
	}else {
		System.out.println("Please Vote");
	}
		
		

	}

}
