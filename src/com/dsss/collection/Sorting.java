package com.dsss.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sorting {
	public static void main(String[] args) {


		ArrayList<Product> a=new ArrayList<Product>();
		a.add(new Product(10,"sen","Suthor1"));
		a.add(new Product(20,"pen2","author3"));
		a.add(new Product(30,"pen3","author3"));

		Iterator<Product> a1=a.iterator();
		while(a1.hasNext()) {

			Product p = (Product) a1.next();
			System.out.println(p.id+" "+p.name+" "+p.Author);
			
		}
		/*Iterator<Product> a1=a.iterator();
		while(a1.hasNext()) {

			Product p = (Product) a1.next();
			if(p.id==10)
			{a1.remove();}



		}
		for(Product p:a) {
			System.out.println(p.id+" "+p.name+" "+p.Author);
		}*/
		Collections.sort(a, new Idcomp());
		for(Product p:a) {
			System.out.println(p.id+" "+p.name+" "+p.Author);
		}
	}
}

