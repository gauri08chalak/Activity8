//Author:Gauri Chalak
//performing StringBufferOperations

package com.question3;

public class StringBufferClass {
	
	public static void main(String[] args) {
		
		StringBuffer s=new StringBuffer("Gauri");
		
		System.out.println(s.append(" Chalak "));
		
		System.out.println(s.insert(20,"I am College Student"));
		
		s.replace(20 , 21 , "Hello");
		
		System.out.println(s.reverse());

	}
}