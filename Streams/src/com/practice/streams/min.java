package com.practice.streams;

import java.util.ArrayList;

public class min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(3);
		al.add(4);
		al.add(1);
		al.add(5);
		
		System.out.println("Normal Sequence "+al );
		
		Integer min= al.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("Minimum Integer "+min);

	}

}
