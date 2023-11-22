package com.practice.streams;


import java.security.AlgorithmConstraints;
import java.util.ArrayList;

public class Array {

	public static void main(String args[]) {
		
	
	
	ArrayList<Integer> al = new ArrayList<Integer>();
	
	al.add(4);
	al.add(2);
	al.add(9);
	
	Integer[] array=al.stream().toArray(Integer[]::new);
	for(Integer x:array) {
		System.out.println(x);
	}
	
    
	
}
}
