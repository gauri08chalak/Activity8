//Author:Gauri Chalak
//adding and retrieving the state name

package com.question2;

public class StatesMain {

	public static void main(String[] args) {
		States s=new States();
		s.addState("Maharashtra");
		s.addState("Goa");
		s.addState("Andhra Pradesh");
		s.addState("Punjab");
		s.addState("Odisha");
		
		System.out.println("retrieve the details of the state "+s.retrieveState("Maharashtra"));
		

	}
}