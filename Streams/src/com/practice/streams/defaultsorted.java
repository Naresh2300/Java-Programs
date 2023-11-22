package com.practice.streams;

import java.awt.Adjustable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class defaultsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(5);
		al.add(2);
		al.add(1);
		al.add(15);
		
		List<Integer> l = al.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Natural Default Sorting of List :"+l);
		
		
		List<Integer> li = al.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
		
		//OR
		
		//List<Integer> li = al.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		//Works same as above
		//Default Sorting without Arguement & Customized Sorting with Arguement
		
		System.out.println("Customized Sorting of Stream :"+li);
		

	}

}
