//Author: Gauri Chalak
//performing String Builder class

package com.question3;

public class StringBuilderClass {
	
	public static void main(String[] args) {
		String s1="Gauri";
		String s2=s1.concat(" Chalak");
		String s3=new String("I am Gauri Chalak");
		
		
        System.out.println("the concatenated string is: "+s2);
        System.out.println("----------------------------------------------");
        
        System.out.println(s3.substring(5));
      	System.out.println("----------------------------------------");
      	 
      	System.out.println(s2.length());
      	
	}
}