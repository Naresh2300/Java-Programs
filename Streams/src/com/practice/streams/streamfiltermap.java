package com.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class streamfiltermap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<>();
		
		al.add("Akky");
		al.add("priyanka");
		al.add("bharat");
		al.add("Chetan");
		al.add("Parag");
		
		List<String> ls = al.stream().filter(s->s.length()>=5).collect(Collectors.toList());
		
		System.out.println(ls);
		
		List<String> lc =ls.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(lc);
		
		
		long count = al.stream().filter(s->s.length()>=5).count();
		
		System.out.println("The length of character greater than >=5 is "+ count);
		

	}

}
