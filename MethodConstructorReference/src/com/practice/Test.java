package com.practice;


interface interf{
	
	public void m1();
	
}

public class Test {

	public static void m2() {
		System.out.println("Method Reference Implementation");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Test test=new Test();      static 
		
		interf i = Test::m2;
		
		//to call
		i.m1();

	}

}
