package com.dsss.test;

public class Try {
	void m1() throws Exception {
		System.out.println("hi1");
		Thread.sleep(2000);
	}
	public static void main(String[] args) {
		Try t= new Try();
		try {
			t.m1();
		} catch (InterruptedException e) {
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
