//Author:Gauri Chalak
//Sorting based on name and price of product using  comparator

package com.question1;

import java.util.ArrayList;
import java.util.Collections;


public class ProductMain {

	public static void main(String[] args) {
		Product p1=new Product(1,"Phone",30000);
		Product p2=new Product(2,"Bag",10000);
		Product p3=new Product(3,"Tablet",50000);
		ArrayList<Product> prod=new ArrayList<>();
		prod.add(p1);
		prod.add(p2);
		prod.add(p3);
		
		System.out.println("sorting by price");
		Collections.sort(prod, new ProductPrice());
		for(Product p:prod)
		{
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
		System.out.println("-----------------------------");
		
		System.out.println("sorting by name");
		Collections.sort(prod, new ProductName());
		for(Product p:prod)
		{
			System.out.println(p.id+" "+p.name+" "+p.price);
		}
	}
}