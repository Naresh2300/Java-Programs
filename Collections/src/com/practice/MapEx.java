package com.practice;

import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		TreeMap<Integer, String> Tm = new TreeMap<Integer, String>((I1,I2)->(I1>I2)?-1:(I1<I2)?1:0);
		
		Tm.put(1, "Chinny");
		Tm.put(5, "Sinny");
		Tm.put(2, "Binny");
		
		
		System.out.println(Tm);

	}

}
