package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
//		if(o1>o2) {
//			return -1;
//		}
//		else if(o1<o2) {
//			return +1;
//		}
//		else {
//		
//		return 0;
//	} 
//	}
		
		//ABOVE SAME CODE IN ONE LINE 
		
		return (o1>02)?-1:(o1<o2)?+1:0;
	
//	class Test{
//		
//		public static void main(String[] args) {
//			
//			ArrayList<Integer> al = new ArrayList<Integer>();
//			
//			al.add(5);
//			al.add(0);
//			al.add(10);
//			
//			System.out.println("Before Sorting "+al);
//			
//			Collections.sort(al, MyComparator());
//			
//			System.out.println("After Sorting "+ al);
//		}
//	
//	}
	
	
	}
}
	


