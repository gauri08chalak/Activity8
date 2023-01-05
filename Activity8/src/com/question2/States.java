//Author:Gauri Chalak
//Sorting based on name and price of product using  comparator

package com.question2;

import java.util.HashSet;
import java.util.Iterator;

public class States {
	HashSet<String> h1=new HashSet<>();     
	void addState(String stateName)   
	{
		h1.add(stateName);             //adding stateName
	}
	
	  public String retrieveState(String stateName)  //creating method retrieveState
	{
		Iterator itr=h1.iterator();     //displaying states using iterator
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		if(h1.contains(stateName))  //checking stateName is there or not
		{
			return stateName;
		}
		else
		{
		     return null;
		}
		
	}

}
