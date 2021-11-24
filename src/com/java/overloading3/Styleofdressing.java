package com.java.overloading3;

public class Styleofdressing {
	public void home(String s) {
		System.out.println("at Home T-shirt with Track"+ s);

	}
	public void home(int i) {
		System.out.println("at Office Business casuals"+i);

	}
	public void home(String s, int i) {
		System.out.println("at Occasions Traditionals"+s +i);

	}

	public static void main(String[] args) {
		Styleofdressing sd=new Styleofdressing();
		sd.home(11);
		sd.home("AJITH STYLE");
		sd.home("KUMAR", 16);



	}

}
