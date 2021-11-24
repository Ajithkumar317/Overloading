package com.java.polymorphismoverloading;

public class Overloading {
	public void stname(String s) {
		System.out.println(""+ s);
		
	}
	public void stname(String s,int i) {
		System.out.println(""+ s + i);
		
	}
	public void stname(char c) {
		System.out.println(""+ c);
		
	}
	public static void main(String[] args) {
		Overloading ov = new Overloading();
		ov.stname("operations specialist",  2);
		ov.stname('B');
		
		
		ov.stname("Ajith kumar");
		
				
	}

}
