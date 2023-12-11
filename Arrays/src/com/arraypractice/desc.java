package com.arraypractice;


import java.util.Arrays;
import java.util.Collections;

public class desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arri= {1,5,7,9};
		
		Arrays.sort(arri, Collections.reverseOrder());
		
		int i=0;
		while(i<arri.length) {
		System.out.println(arri[i]+ " ");
		i++;
		}
		
		//System.out.println("Array elements in descending order: " +Arrays.toString(arri));  
		
		
//		for(int i=0 ; i<arri.length ;i++) {
//			System.out.println(arri[i]+" ");
//		}
		
	}

}
