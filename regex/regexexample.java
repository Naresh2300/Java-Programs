package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Character Classes

public class regexexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile("[^abc]");   // can put[a-zA-Z0-9@#&]
		Matcher m = p.matcher("az05@&*$yybdxcc");  // target  to search
		
		while(m.find()) {
			
			System.out.println(m.start()+"  "+m.group());
		}

	}

}
