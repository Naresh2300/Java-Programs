package stringpractice;

import java.util.Scanner;

public class length {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String st;
		st = sc.nextLine();
		
		int sa =st.length();
		
		String s= "sunil";
		
		int a=s.length();
		
		System.out.println(a);
		
		
		if(sa==0) {
			System.out.println("Invalid Length Size");
			{
				System.out.println("Reenter size");
				st=sc.nextLine();{
					if(sa>0) {
						System.out.println("Well Done");
					}
				}
			}
		
			
			
		}
		

	}

}
