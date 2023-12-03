package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
		
		Pattern  p = Pattern.compile("ab");
		Matcher m = p.matcher("abcdabiiab");
		
		while(m.find()) {
			count++;
			System.out.println(m.start()+" "+m.end()+" "+m.group()); // m.end will tell index no after pattern ends
		}
		System.out.println("Count = "+count);
		

	}

}
