package com.dsss.test;

public class Class1 {

	public static void main(String[] args) {
		String s = "Suresh";
		s = s.concat("babu");
		System.out.println(s);

		StringBuffer s1 = new StringBuffer("raju");
		s1.append("babu");
		System.out.println(s1.reverse());
		for (int i = 0; i < 10; i++) {

			if (i == 3) {
				continue;
			}
			System.out.println("Suresh" + i);
		}

		System.out.println("After break");
	}
}
