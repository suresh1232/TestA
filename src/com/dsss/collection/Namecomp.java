package com.dsss.collection;

import java.util.Comparator;

public class Namecomp implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p2.name.compareTo(p1.name);
System.out.println("done");

	}
	
}
