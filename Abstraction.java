import java.util.Scanner;

abstract class Shape{
	
	float area;
	Scanner sc = new Scanner(System.in);

	
	abstract public void acceptInput();
	abstract public void calArea();
	
	public void dispArea() {
		System.out.println(area);
	}	
}

class Square extends Shape{
	
	private float side;
//	private float area;
	
	public void acceptInput() {
		
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the side");
		side = sc.nextFloat();
	}
	public void calArea() {
		area = side * side;
	}
//	public void dispArea() {
//		System.out.println(area);
//	}
}

class Rectangle extends Shape{
	
	private float length;
	private float breadth;
//	private float area;
	
	public void acceptInput() {
		
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length");
		length = sc.nextFloat();
		System.out.println("Enter the breadth");
		breadth = sc.nextFloat();
	}
	public void calArea() {
		area = length * breadth;
	}
//	public void dispArea() {
//		System.out.println(area);
//	}
}

class Circle extends Shape{
	
	private float radius;
//	private float area;
	
	public void acceptInput() {
		
		//Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius");
		radius = sc.nextFloat();
		
	}
	public void calArea() {
		area = 3.141f * radius * radius;
	}
//	public void dispArea() {
//		System.out.println(area);
//	}
}

class Geometry {
	
	static void permit ( Shape ref) {
		ref.acceptInput();
		ref.calArea();
		ref.dispArea();
	}
}

public class Abstraction {

	public static void main(String[] args) {

		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
//		Geometry g = new Geometry();
		Geometry.permit(s);
		Geometry.permit(r);
		Geometry.permit(c);
		
//		s.acceptInput();
//		s.calArea();
//		s.dispArea();
//		
//		r.acceptInput();
//		r.calArea();
//		r.dispArea();
//		
//		c.acceptInput();
//		c.calArea();
//		c.dispArea();
	}

}
