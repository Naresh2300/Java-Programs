package com.arraypractice;

public class MinElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int[] a= {2,5,7,9,3};
		
		int min=a[0];
		
		for(int i=1 ; i<a.length ; i++) {
			
			if(a[i] <  min) {
				min=a[i];
			}
		}
		
		System.out.println("Minimum  ELement is "+min);
		
		

	}

}
