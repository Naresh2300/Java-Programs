package com.arraypractice;

public class MaxElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {2,5,7,9,3};
		
		int max=a[0];
		
		for(int i=1 ; i<a.length ; i++) {
			
			if(a[i] >  max) {
				max=a[i];
			}
		}
		
		System.out.println("Maximum ELement is "+max);
		
		

	}

}
