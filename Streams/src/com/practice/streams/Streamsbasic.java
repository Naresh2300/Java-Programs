package com.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamsbasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(0);
		al.add(5);
		al.add(10);
		al.add(15);
		
		List<Integer> list =al.stream().filter(l->l%2==0).collect(Collectors.toList());
		System.out.println(list);
		
	}

}
