package com.practice;

import java.util.ArrayList;
import java.util.Collections;

public class TestwithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(1);
		al.add(3);
		al.add(5);
		al.add(9);
		al.add(12);
		
		System.out.println("Before Sorting "+al);
		
		Collections.sort(al, (I1,I2)->(I1>I2)?-1: (I1<I2)?1: 0);
		
		System.out.println("After Sorting "+al);

	}

}
