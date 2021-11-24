package overloading4;

public class Typicalexampleforoverloading {
	public void stId(int i) {
		System.out.println(" Student Id is "+  i);

	}
	public void stId(char c) {
		System.out.println(" Student Initial is "+ c);
	}
	public void stId(String  s) {
		System.out.println(" Student name is "+s);
	}
	public void stId(Float f) {
		System.out.println(" Student CGPA is "+ + f);


	}


	public static void main(String[] args) {
		Typicalexampleforoverloading teo=new Typicalexampleforoverloading();
		teo.stId('B');
		teo.stId("AJITHKUMAR");	
		teo.stId(11);
		teo.stId(8.99f);



	}

}
