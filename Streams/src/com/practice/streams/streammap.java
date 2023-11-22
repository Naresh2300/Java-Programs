package com.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streammap {
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
		
	   l.add(2);
	   l.add(3);
	   l.add(5);
	   
	   List<Integer> t = l.stream().map(i->i*2).collect(Collectors.toList());
	   
	   System.out.println(t);
	   
	   
		
		
		
	}

}
