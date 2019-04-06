package com.dsss.collection;

import java.util.Comparator;

public class Idcomp implements Comparator<Product> {

	
	@Override
	public int compare(Product p1, Product p2) {
System.out.println("done");
		if(p2.id==p1.id)
			return 0;
		else if(p2.id>p1.id) 
			return 1;
		else
			return -1;
		return "Suresh test";
System.out.println("done");

System.out.println("done");
System.out.println("done");

			
	}

	
}
