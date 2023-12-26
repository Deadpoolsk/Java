class Printer {
	
	void add(int a) {
		System.out.println(a);
	}
	void add(float a) {
		System.out.println(a);
	}
	void add(char a) {
		System.out.println(a);
	}
	void add(boolean a) {
		System.out.println(a);
	}
	void add(double a) {
		System.out.println(a);
	}
	void add(short a) {
		System.out.println(a);
	}
	void add(int a , int b) {
		System.out.println(a+ " " + b);
	}
	void add(float a , float b) {
		System.out.println(a);
	}
	void add(double a , double b) {
		System.out.println(a);
	}
	void add(float a , int b) {
		System.out.println(a);
	}
	void add(int a , int b , int c) {
		System.out.println(a + " " + b + " " + c);
	}
	void add(int a , char b  , float c) {
		System.out.println(a);
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
	
		int a = 10;
		int b = 20;
		int c = 30;
		char ch = 'a';
		float f = 5.5f;
		double d = 55.55;
		Printer p = new Printer();
		p.add(a);
		p.add(a,b);
		p.add(a,b,c);
		p.add(f);
		p.add(d);
		p.add(ch);
		
	}

}

