package com.practice;

import java.util.TreeSet;

public class TreeSetwithLamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Provide Values in Constructor Only
		//By Default TreeSet sorting is Ascending only without using Collection.Sort Also.
		
		TreeSet<Integer> Ts = new TreeSet<Integer>((I1,I2) -> (I1>I2)?-1:(I1<I2)?1:0);
		
		Ts.add(0);
		Ts.add(2);
		Ts.add(5);
		
		System.out.println(Ts);

	}

}
