package com.java.polymorphismoverloading;

public class Overloading2 {
	public void talk(parents styleofspeaking) {
		System.out.println("respectfully");
		
		
		
	}
	public void talk(Children styleofspeaking) {
		System.out.println("lovable");
		
		
		
	}
	public static void main(String[] args) {
		Overloading2 ov=new Overloading2();
		parents pr=new parents();
		Children cr=new Children();
				ov.talk(cr);
				ov.talk(pr);

				
	}

}
