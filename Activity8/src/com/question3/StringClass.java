//Author:Gauri Chalak
//performing String Class

package com.question3;

public class StringClass {

	public static void main(String[] args) {
		
		
		
		String s1=new String("Tejaswi@is@Beutiful@girl");
		String s2=new String("Gauri");
		String s3="Dhruv";
		String s4="Amruta";
		
		System.out.println(s1.charAt(5));				//print the character at given position position
		System.out.println(s3.compareTo(s2));			
		System.out.println(s2.concat(s4));
		
		System.out.println("------------------------");
		System.out.println(s1.indexOf("t"));		
		System.out.println(s1.replaceAll("Tejaswi@is@Beutiful@girl","Tejaswi is good girl"));	
		
		System.out.println(s1.substring(9));			
		System.out.println(s3.toLowerCase());	//convert upper case letter to lower case
		
		

	}

}
